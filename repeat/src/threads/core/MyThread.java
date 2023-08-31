package threads.core;

import threads.ThreadUtils;

public class MyThread extends Thread{

    @Override
    public void run() {
        ThreadUtils.printThreadInfo();
    }
}
