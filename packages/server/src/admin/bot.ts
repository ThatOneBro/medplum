import { ContentType, createReference, getReferenceString } from '@medplum/core';
import { AccessPolicy, Binary, Bot, Project, ProjectMembership, Reference } from '@medplum/fhirtypes';
import { Request, Response } from 'express';
import { body, validationResult } from 'express-validator';
import { Readable } from 'stream';
import { invalidRequest, sendOutcome } from '../fhir/outcomes';
import { Repository, systemRepo } from '../fhir/repo';
import { getBinaryStorage } from '../fhir/storage';

export const createBotValidators = [body('name').notEmpty().withMessage('Bot name is required')];

const defaultBotCode = `import { BotEvent, MedplumClient } from '@medplum/core';

export async function handler(medplum: MedplumClient, event: BotEvent): Promise<any> {
  // Your code here
}
`;

export async function createBotHandler(req: Request, res: Response): Promise<void> {
  const errors = validationResult(req);
  if (!errors.isEmpty()) {
    sendOutcome(res, invalidRequest(errors));
    return;
  }

  const bot = await createBot(res.locals.repo as Repository, {
    ...req.body,
    project: res.locals.project,
  });

  res.status(201).json(bot);
}

export interface CreateBotRequest {
  readonly project: Project;
  readonly name: string;
  readonly description?: string;
  readonly accessPolicy?: Reference<AccessPolicy>;
  readonly runtimeVersion?: 'awslambda' | 'vmcontext';
}

export async function createBot(repo: Repository, request: CreateBotRequest): Promise<Bot> {
  const filename = 'index.ts';
  const contentType = ContentType.TYPESCRIPT;
  const binary = await repo.createResource<Binary>({
    resourceType: 'Binary',
    contentType,
  });
  await getBinaryStorage().writeBinary(binary, filename, contentType, Readable.from(defaultBotCode));

  const bot = await repo.createResource<Bot>({
    meta: {
      project: request.project.id,
    },
    resourceType: 'Bot',
    name: request.name,
    description: request.description,
    runtimeVersion: request.runtimeVersion ?? 'awslambda',
    sourceCode: {
      contentType,
      title: filename,
      url: getReferenceString(binary),
    },
  });

  await systemRepo.createResource<ProjectMembership>({
    meta: {
      project: request.project.id,
    },
    resourceType: 'ProjectMembership',
    project: createReference(request.project),
    user: createReference(bot),
    profile: createReference(bot),
    accessPolicy: request.accessPolicy,
  });

  return bot;
}
