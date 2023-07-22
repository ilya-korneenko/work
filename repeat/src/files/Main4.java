package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main4 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader( new FileReader("namesWithNewLine.txt"));
        }catch (FileNotFoundException e){
            System.out.println("файл не найден");
            System.out.println(e.getMessage());
        }

        try {
            String line;
            while ((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Что-то пошло не так");
        }

    }
}
