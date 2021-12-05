package Lab6;

public class StopWatchMain {
    public static void main(String[] args) {
        int size = 100000;

        // double[] list = new double[size];

        StopWatch stopwatch = new StopWatch();

        for (int i = 0; i < size; i++) {
            System.out.println("OOooo.... A... Ahhhhh...");
        }

        stopwatch.stop();

        System.out.println("The Time is " + stopwatch.getElapsedTime() + " Milli Second");
    }
}
