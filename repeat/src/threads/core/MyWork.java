package threads.core;

import threads.ThreadUtils;

public class MyWork implements Runnable {

    @Override
    public void run() {
        ThreadUtils.printThreadInfo();

    }
}
