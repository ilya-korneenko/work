package threadsBook;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MaxThread implements Runnable{
    Thread thread;
    MaxThread(){
        thread = new Thread(this);
    }

    void start(){
        thread.start();
    }

    @Override
    public void run() {
        ThreadLocalRandom thr = ThreadLocalRandom.current();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=thr.nextInt(1,1000);
        }
        int maxValue = arr[0];
        for (int number : arr) {
            if(maxValue<number){
                maxValue=number;
            }
        }
        System.out.println(Arrays.stream(arr).max() + ":" + maxValue);
    }
}
