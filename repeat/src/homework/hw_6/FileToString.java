package homework.hw_6;

import java.io.*;


public class FileToString {
    //private final StringBuilder str = new StringBuilder("");

//    public StringBuilder getStr() {
//        return str;
//    }

    public String fileToString(String filename) {
        StringBuilder str = new StringBuilder("");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                str.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то явно идёт не так");
        }
        return String.valueOf(str);
    }

}
