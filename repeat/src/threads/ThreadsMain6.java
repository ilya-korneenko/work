package threads;

import threads.core.InfinityWork;

public class ThreadsMain6 {
    public static void main(String[] args) {
        ThreadUtils.printThreadInfo();

        Runnable work = new InfinityWork();
        Thread th1 = new Thread(work);
        Thread th2 = new Thread(work);
        Thread th3 = new Thread(work);

        th1.start();
        th2.start();
        th3.start();

        th1.interrupt();
        th2.interrupt();
        th3.interrupt();

        System.err.println("Мы закончили");
    }
}
