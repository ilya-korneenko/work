package threads.core;

import threads.ThreadUtils;

import java.util.concurrent.TimeUnit;

public class InfinityWork implements Runnable{
    @Override
    public void run() {
        ThreadUtils.printThreadInfo();
        Thread curr = Thread.currentThread();
        while (true){
            System.err.println("Привет, я поток! " + curr.getId());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
