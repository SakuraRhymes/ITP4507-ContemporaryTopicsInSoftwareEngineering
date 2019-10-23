package WS5_180104583.Q2;

import java.util.Vector;

public class TaskMinder extends Thread {
    private long sleepInterval, now;
    private Vector<TaskEntry> taskEntries;


    public TaskMinder(long sleepInterval) {
        taskEntries = new Vector<>();
        this.sleepInterval = sleepInterval;
    }

    public void run() {
        while (true) {
            try {
                sleep(sleepInterval);
                now = System.currentTimeMillis();

                for (TaskEntry taskEntry : taskEntries) {
                    if (taskEntry.getRepeatInterval() + taskEntry.getTimeLastDone() <= now) {
                        taskEntry.performTask();
                        taskEntry.setTimeLastDone(now);
                    }
                }
            } catch (Exception e) {
                System.out.println("Interrupted sleep : " + e);
            }
        }
    }

    public void addTaskEntry(TaskEntry taskEntry) {
        taskEntries.add(taskEntry);
    }
}
