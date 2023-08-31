package threads;

import threads.core.MyThread;
import threads.core.MyWork;

public class ThreadsMain3 {
    public static void main(String[] args) {
        ThreadUtils.printThreadInfo();

        Thread th1 = new Thread(new MyWork());
        th1.start();
    }
}
