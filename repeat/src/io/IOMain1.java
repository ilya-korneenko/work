package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOMain1 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("eng.txt");
            int read = inputStream.read();
            System.out.println(read + " : " + (char) read);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            InputStream inputStream = new FileInputStream("rus.txt");
            int read = inputStream.read();
            System.out.println(read + " : " + (char) read);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
