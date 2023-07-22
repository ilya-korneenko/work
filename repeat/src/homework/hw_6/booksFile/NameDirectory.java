package homework.hw_6.booksFile;

import java.util.Scanner;

public class NameDirectory {
    private String name;

    public String getNameDirectory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название директории:\t");
        return scanner.nextLine();
    }

}
