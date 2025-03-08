import { Text, Stack, Box, Button } from '@mantine/core';
import { Practitioner, Task } from '@medplum/fhirtypes';
import { Loading, useMedplum } from '@medplum/react';
import { Outlet } from 'react-router';
import { useCallback, useEffect, useState } from 'react';
import { showNotification } from '@mantine/notifications';
import { getReferenceString, normalizeErrorString } from '@medplum/core';
import { IconCircleOff } from '@tabler/icons-react';
import { TaskQuestionnaireResponseSummaryPanel } from '../components/Task/TaskQuestionnaireResponseSummaryPanel';
import { EncounterHeader } from '../components/Encounter/EncounterHeader';
import { useEncounter } from '../../hooks/useEncounter';
import { usePatient } from '../../hooks/usePatient';

export const EncounterComplete = (): JSX.Element => {
  const medplum = useMedplum();
  const patient = usePatient();
  const encounter = useEncounter();
  const [task, setTask] = useState<Task | undefined>();
  const [practitioner, setPractitioner] = useState<Practitioner | undefined>();

  const fetchTasks = useCallback(async (): Promise<void> => {
    if (!encounter) {
      return;
    }

    const taskResult = await medplum.searchResources('Task', `encounter=${getReferenceString(encounter)}`);

    taskResult.sort((a: Task, b: Task) => {
      const dateA = new Date(a.authoredOn || '').getTime();
      const dateB = new Date(b.authoredOn || '').getTime();
      return dateA - dateB;
    });

    setTask(taskResult[0]);
  }, [medplum, encounter]);

  useEffect(() => {
    const fetchPractitioner = async (): Promise<void> => {
      if (encounter?.participant?.[0]?.individual) {
        const practitionerResult = await medplum.readReference(encounter.participant[0].individual);
        setPractitioner(practitionerResult as Practitioner);
      }
    };

    fetchPractitioner().catch((err) => {
      showNotification({
        color: 'red',
        icon: <IconCircleOff />,
        title: 'Error',
        message: normalizeErrorString(err),
      });
    });
  }, [encounter, medplum]);

  useEffect(() => {
    fetchTasks().catch((err) => {
      showNotification({
        color: 'red',
        icon: <IconCircleOff />,
        title: 'Error',
        message: normalizeErrorString(err),
      });
    });
  }, [medplum, encounter, fetchTasks]);

  if (!patient || !encounter) {
    return <Loading />;
  }

  return (
    <>
      <Stack justify="space-between" gap={0}>
        <EncounterHeader patient={patient} encounter={encounter} practitioner={practitioner} />

        <Box p="md">
          <Text size="lg" color="dimmed" mb="lg">
            Encounter {encounter?.period?.start ?? ''}
          </Text>

          <div style={{ display: 'grid', gridTemplateColumns: '1fr 300px', gap: '24px' }}>
            <Stack gap="md">{task && <TaskQuestionnaireResponseSummaryPanel task={task} key={task.id} />}</Stack>
            <Button variant="outline">View Claim</Button>
          </div>
          <Outlet />
        </Box>
      </Stack>
    </>
  );
};
