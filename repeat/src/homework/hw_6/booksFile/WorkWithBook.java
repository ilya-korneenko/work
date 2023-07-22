package homework.hw_6.booksFile;

import homework.hw_6.FileToString;

import java.io.File;
import java.util.Scanner;

public class WorkWithBook {

    private final Scanner scanner = new Scanner(System.in);
    private final SearchInBook search = new SearchInBook();
    private final SaveResultsInFile results = new SaveResultsInFile();
    private final FileToString fileToString = new FileToString();

    public void work(File[] namesBook) {
        String book;
        int index = -1;
        do {
            outputAllBooks(namesBook);
            System.out.println("Выберите номер книги, с которой будем работать." +
                    "\n|Для выхода введите -1|");
            //тут стоило было сделать проверку на диапазон
            index = scanner.nextInt();
            book = fileToString.fileToString( namesBook[index].getName());
            search.search(book);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        }while (index!= -1);
    }

    public void work(File[] namesBook, String nameDirectory) {
        String book;
        int index = -1;
        do {
            outputAllBooks(namesBook);
            System.out.println("Выберите номер книги, с которой будем работать." +
                    "\n|Для выхода введите -1|");
            //тут стоило было сделать проверку на диапазон
            index = scanner.nextInt();
            book = fileToString.fileToString( nameDirectory + "//"+namesBook[index].getName());
            String res = search.search(book);
            recordResult(namesBook[index].getName(),res);

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        }while (index!= -1);
    }

    private void recordResult(String nameFile, String res){
        results.saveResult(nameFile, res);
    }
    private static void outputAllBooks(File[] namesBook){
        for (int i = 0; i < namesBook.length; i++) {
            System.out.println(i + " " + namesBook[i]);
        }
    }
}
