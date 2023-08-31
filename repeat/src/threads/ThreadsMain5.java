package threads;

import threads.core.InfinityWork;

public class ThreadsMain5 {
    public static void main(String[] args) {
        ThreadUtils.printThreadInfo();

        Runnable work = new InfinityWork();
        Thread th1 = new Thread(work);
        Thread th2 = new Thread(work);
        Thread th3 = new Thread(work);

        th1.setDaemon(true);
        th2.setDaemon(true);
        th3.setDaemon(true);

        th1.start();
        th2.start();
        th3.start();

        th1.stop();
        th2.stop();
        th3.stop();
    }
}
