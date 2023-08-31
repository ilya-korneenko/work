package threadsBook;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MaxThreadMain {
    public static void main(String[] args) {
        MaxThread maxThread1 = new MaxThread();
        maxThread1.start();

        MaxThread maxThread2 = new MaxThread();
        maxThread2.start();

        MaxThread maxThread3 = new MaxThread();
        maxThread3.start();

        MaxThread maxThread4 = new MaxThread();
        maxThread4.start();

        MaxThread maxThread5 = new MaxThread();
        maxThread5.start();

        MaxThread maxThread6 = new MaxThread();
        maxThread6.start();

        MaxThread maxThread7 = new MaxThread();
        maxThread7.start();

        MaxThread maxThread8 = new MaxThread();
        maxThread8.start();

        MaxThread maxThread9 = new MaxThread();
        maxThread9.start();

        MaxThread maxThread10 = new MaxThread();
        maxThread10.start();

    }
}
