package homework.hw_5.generation;

import java.util.Arrays;
import java.util.List;

public class CreateAnimalNick {
    private final GenerationSomeStr generation = new GenerationSomeStr();
    private final List<String> trueNick = Arrays.asList("Джек", "Verter", "Boby", "Шарик",
            "Валик", "Муму", "Kit" );

    /**
     * генерация англ строки
     * @return рандомную строку из неважно чего
     */
    public String unimportantEnglishStr(){
        return generation.unimportantEnglishStr();
    }

    /**
     * генерация русской строки
     * @return рандомную русскую строку
     */
    public String unimportantRussianStr(){
        return generation.unimportantRussianStr();
    }

    /**
     * генерация настоящей клички
     * @return рандомную настоящую кличку
     */
    public String importantStrTrueNicks(){
        return generation.importantStrTrueNames(trueNick);
    }
}
