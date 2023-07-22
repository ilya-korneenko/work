package homework.hw_5.generation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GenerationSomeStr {
    private String name;
    private final int indexNum = 5;
    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private final String englishAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String russianAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public final List<String> trueName = Arrays.asList("Jon", "Bob", "Илья", "Карина", "Полина",
            "Максим", "Влад", "Костя", "Лиза", "Коля");

    /**
     * создание рандомной английской строки
     */
    public String unimportantEnglishStr(){
        return unimportantStrFromAlphabet(englishAlphabet);
    }

    /**
     * создание рандомной русской строки
     */
    public String unimportantRussianStr(){
        return unimportantStrFromAlphabet(russianAlphabet);
    }

    /**
     * создание строки из настоящих имён
     * @return рандомноё имя из ArrayList строк
     */
    public String importantStrTrueNames(List<String> trueStr){
        return trueName.get(random.nextInt(0 ,trueName.size()));
    }

    /**
     * создание рандомной строки
     * @param alphabet - русский или английский алфавит
     */
    private String unimportantStrFromAlphabet(String alphabet){
        StringBuilder str = new StringBuilder();
        //indexNum();
        for (int i = 0; i < indexNum; i++) {
            char a = alphabet.charAt(random.nextInt(0,51));
            str.append(a);
        }
        return String.valueOf(str);
    }
}
