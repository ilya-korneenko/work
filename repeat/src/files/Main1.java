package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("names.txt");
        }catch (FileNotFoundException e){
            System.out.println("файл не найден");
            System.out.println(e.getMessage());
        }
        int ch;
        try {
//            ch = reader.read();
            do {
                ch = reader.read();
                if(ch!=-1) {
                    System.out.print(Character.toChars(ch));
                }
            }while (ch!=-1);
        } catch (IOException e) {
            System.out.println("gg");
        }
    }
}
