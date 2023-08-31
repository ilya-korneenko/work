package threadsBook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class CreateFileThreadMain {
    public static void main(String[] args) {
        CreateFileThread create1 = new CreateFileThread();
        create1.start();
        CreateFileThread create2 = new CreateFileThread();
        create2.start();
        CreateFileThread create3 = new CreateFileThread();
        create3.start();
        CreateFileThread create4 = new CreateFileThread();
        create4.start();
        CreateFileThread create5 = new CreateFileThread();
        create5.start();

    }

}
