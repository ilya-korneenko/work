package homework.hw_5.generation;

import java.util.concurrent.ThreadLocalRandom;


public class CreatePasswordPerson {
    private final GenerationSomeStr generate = new GenerationSomeStr();


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

    /**
     * Создание рандомной числовой строки
     * @return строку цифр
     */
    public String numberPassword(){
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int indexInPassword;
        indexInPassword = random.nextInt(1, 13);
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < indexInPassword; i++) {
            password.append(random.nextInt(0,9));
        }
        return String.valueOf(password);
    }
}
