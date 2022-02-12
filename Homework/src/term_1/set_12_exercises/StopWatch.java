package term_1.set_12_exercises;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        start();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
