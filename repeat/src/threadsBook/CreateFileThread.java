package threadsBook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class CreateFileThread implements Runnable{
    Thread thread;
    CreateFileThread(){
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
            arr[i]= thr.nextInt(10,1000);
        }
        StringBuilder strWriteToFile = new StringBuilder();
        strWriteToFile.append(Arrays.toString(arr)).append("\n");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("threadFile.txt",true))){
            bufferedWriter.write(String.valueOf(strWriteToFile));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
