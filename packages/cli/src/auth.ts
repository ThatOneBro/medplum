import { ContentType, MedplumClient, getDisplayString, normalizeErrorString } from '@medplum/core';
import { exec } from 'child_process';
import { createServer } from 'http';
import { platform } from 'os';
import { FileSystemStorage } from './storage';
import { createMedplumClient } from './util/client';
import { createMedplumCommand } from './util/command';
import { Profile, jwtAssertionLogin, jwtBearerLogin, loadProfile, profileExists, saveProfile } from './utils';

const clientId = 'medplum-cli';
const redirectUri = 'http://localhost:9615';

export const login = createMedplumCommand('login');
export const whoami = createMedplumCommand('whoami');

login.action(async (options) => {
  const profileName = options.profile ?? 'default';
  const storage = new FileSystemStorage(profileName);
  if (!profileExists(storage, profileName)) {
    console.log(`Creating new profile...`);
    saveProfile(profileName, options);
  }
  if (options.authType === 'basic') {
    console.log('Basic authentication does not require login');
    return;
  }
  const profile = loadProfile(profileName);
  const medplum = await createMedplumClient(options);
  await startLogin(medplum, profile);
});

whoami.action(async (options) => {
  const medplum = await createMedplumClient(options);
  printMe(medplum);
});

async function startLogin(medplum: MedplumClient, profile: Profile): Promise<void> {
  if (!profile?.authType) {
    await medplumAuthorizationCodeLogin(medplum);
    return;
  }
  if (profile.authType === 'jwt-bearer') {
    if (!profile.clientId || !profile.clientSecret) {
      throw new Error('Missing values, make sure to add --client-id, and --client-secret for JWT Bearer login');
    }
    console.log('Starting JWT login...');
    const accessToken = await jwtBearerLogin(medplum, profile);
    const storage = new FileSystemStorage(profile.name as string);
    storage.setObject('activeLogin', { accessToken });
  } else if (profile.authType === 'jwt-assertion') {
    const accessToken = await jwtAssertionLogin(medplum, profile);
    const storage = new FileSystemStorage(profile.name as string);
    storage.setObject('activeLogin', {
      accessToken,
    });
  }
  console.log('Login successful');
}

async function startWebServer(medplum: MedplumClient): Promise<void> {
  const server = createServer(async (req, res) => {
    const url = new URL(req.url as string, 'http://localhost:9615');
    const code = url.searchParams.get('code');
    if (url.pathname === '/' && code) {
      try {
        const profile = await medplum.processCode(code, { clientId, redirectUri });
        res.writeHead(200, { 'Content-Type': ContentType.TEXT });
        res.end(`Signed in as ${getDisplayString(profile)}. You may close this window.`);
      } catch (err) {
        res.writeHead(400, { 'Content-Type': ContentType.TEXT });
        res.end(`Error: ${normalizeErrorString(err)}`);
      } finally {
        server.close();
      }
    } else {
      res.writeHead(404, { 'Content-Type': ContentType.TEXT });
      res.end('Not found');
    }
  }).listen(9615);
}

/**
 * Opens a web browser to the specified URL.
 * See: https://hasinthaindrajee.medium.com/browser-sso-for-cli-applications-b0be743fa656
 * @param url The URL to open.
 */
async function openBrowser(url: string): Promise<void> {
  const os = platform();
  let cmd = undefined;
  switch (os) {
    case 'openbsd':
    case 'linux':
      cmd = `xdg-open '${url}'`;
      break;
    case 'darwin':
      cmd = `open '${url}'`;
      break;
    case 'win32':
      cmd = `cmd /c start "" "${url}"`;
      break;
    default:
      throw new Error('Unsupported platform: ' + os);
  }
  exec(cmd);
}

/**
 * Prints the current user and project.
 * @param medplum The Medplum client.
 */
function printMe(medplum: MedplumClient): void {
  const loginState = medplum.getActiveLogin();
  if (loginState) {
    console.log(`Server:  ${medplum.getBaseUrl()}`);
    console.log(`Profile: ${loginState.profile.display} (${loginState.profile.reference})`);
    console.log(`Project: ${loginState.project.display} (${loginState.project.reference})`);
  } else {
    console.log('Not logged in');
  }
}

async function medplumAuthorizationCodeLogin(medplum: MedplumClient): Promise<void> {
  await startWebServer(medplum);
  const loginUrl = new URL(medplum.getAuthorizeUrl());
  loginUrl.searchParams.set('client_id', clientId);
  loginUrl.searchParams.set('redirect_uri', redirectUri);
  loginUrl.searchParams.set('scope', 'openid');
  loginUrl.searchParams.set('response_type', 'code');
  loginUrl.searchParams.set('prompt', 'login');
  await openBrowser(loginUrl.toString());
}
