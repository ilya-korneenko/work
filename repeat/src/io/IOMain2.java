package io;

import java.io.*;

public class IOMain2 {
    public static void main(String[] args) {
        try {
            Reader input = new FileReader("eng.txt");
            int read = input.read();
            System.out.println(read + " : " + (char) read);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            Reader input = new FileReader("rus.txt");
            int read = input.read();
            System.out.println(read + " : " + (char) read);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
