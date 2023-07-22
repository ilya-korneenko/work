package homework.hw_6.booksFile;

import homework.hw_6.utils.EasySearch;

import java.util.Scanner;

public class SearchInBook {
    private final EasySearch easySearch = new EasySearch();
    private final Scanner scanner = new Scanner(System.in);

    /**
     * метод поиска слова в тексте
     * @param bookInStr выбранная книга, перекомвентированная в строку
     * @return строку в виде слова и количество его повторений в книге
     */
    public String search(String bookInStr){
        //scanner.remove();
        System.out.println("Введите слово, которое хотите найти:  ");
        String word = scanner.nextLine();
        long countInStr;
        countInStr = easySearch.search(bookInStr,word);
        System.out.println("Слово " + word + " встретилось в тексте " + countInStr);
        return String.valueOf(word + " = " + countInStr);

    }
}
