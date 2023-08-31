package threads;

import threads.runnable.TimerJob;

public class Main2 {
    public static void main(String[] args) {
        Runnable timer = new TimerJob();
        timer.run();
    }
}
