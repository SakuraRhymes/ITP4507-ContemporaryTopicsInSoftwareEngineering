package WS5_180104583.Q2;

public class TaskEntry {
    Task task;
    private long repeatInterval, timeLastDone;

    public TaskEntry(Task task, long repeatInterval) {
        this.task = task;
        this.repeatInterval = repeatInterval;
    }

    public long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public long getTimeLastDone() {
        return timeLastDone;
    }

    public void setTimeLastDone(long timeLastDone) {
        this.timeLastDone = timeLastDone;
    }

    public void performTask(){
        task.performTask();
    }
}
