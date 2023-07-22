
package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main6 {
    public static void main(String[] args) {

        /*
         * эта конструкция называется try с ресурсами
         */
        try (BufferedReader reader = new BufferedReader(new FileReader("namesWithNewLine.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {

            System.out.println("файл не найден");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
        }
    }

}

