package threadsBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadAverage implements Runnable {
    Thread thread;

    ThreadAverage() {
        thread = new Thread(this);
    }

    void start() {
        thread.start();
    }

    private final CreateList create = new CreateList();

    public ArrayList<Integer> list;

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        int average = 0;
        for (Integer number : list) {
            average += number;
        }
        System.out.println(thread.getName() + ":" + thread.getId() + ":" + average);
    }
}
