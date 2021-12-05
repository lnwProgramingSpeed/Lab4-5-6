package Lab6;

public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long stopTime = startTime;

    // Start Time
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Stop Time
    public void stop() {
        stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }
}
