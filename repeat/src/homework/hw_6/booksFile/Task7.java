package homework.hw_6.booksFile;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {


    public static void main(String[] args) {
        NameDirectory name = new NameDirectory();
        String nameDirectory = name.getNameDirectory();
        File directory = new File(nameDirectory);
        Scanner scanner = new Scanner(System.in);

        File[] namesBook = directory.listFiles();

        WorkWithBook work = new WorkWithBook();
        work.work(namesBook);

        StringBuilder str = new StringBuilder("");

        System.out.println("Выбрать номер");
        int indexFile = scanner.nextInt();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(namesBook[indexFile]))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                str.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("файла нет");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(str);
    }
}
