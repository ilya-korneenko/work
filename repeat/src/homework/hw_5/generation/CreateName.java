package homework.hw_5.generation;



import java.util.Arrays;
import java.util.List;

public class CreateName {
    public final List<String> trueName = Arrays.asList("Jon", "Bob", "Илья", "Карина", "Полина",
            "Максим", "Влад", "Костя", "Лиза", "Коля");
    private final GenerationSomeStr generate = new GenerationSomeStr();

    /**
     * создание строки из настоящих имён
     * @return рандомноё имя из ArrayList строк
     */
    public String importantStrTrueNames(List<String> trueNames){
        return generate.importantStrTrueNames(trueName);
    }

    /**
     * создание рандомной английской строки
     */
    public String unimportantEnglishStr(){
        return generate.unimportantEnglishStr();
    }

    /**
     * создание рандомной русской строки
     */
    public String unimportantRussianStr(){
        return generate.unimportantRussianStr();
    }

}
