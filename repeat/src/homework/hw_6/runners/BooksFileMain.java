package homework.hw_6.runners;

import homework.hw_6.booksFile.NameDirectory;
import homework.hw_6.booksFile.WorkWithBook;

import java.io.File;

public class BooksFileMain {
    public static void main(String[] args) {
        NameDirectory getDirectory = new NameDirectory();
        String nameDirectory = getDirectory.getNameDirectory();

        File directory = new File(nameDirectory);
        File [] arrayBooks = directory.listFiles();

        WorkWithBook workWithBook = new WorkWithBook();
        workWithBook.work(arrayBooks,nameDirectory);



    }
}
