package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main3 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("names.txt", Charset.forName("windows-1251"));
        }catch (FileNotFoundException e){
            System.out.println("файл не найден");
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println("Что-то явно пошло не так");
        }

        try {
            int ch;
            while ((ch = reader.read())!= -1){
                System.out.print(Character.toChars(ch));
            }
        }catch (IOException e){
            System.out.println("Что-то пошло не так");
        }

    }
}
