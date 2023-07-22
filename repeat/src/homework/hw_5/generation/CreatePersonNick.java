package homework.hw_5.generation;

public class CreatePersonNick {
    private final CreateName createName = new CreateName();
    private final GenerationSomeStr generation = new GenerationSomeStr();

    public String  unimportantRussianStr(){
        return generation.unimportantRussianStr();
    }

    public String unimportantEnglishStr(){
        return generation.unimportantEnglishStr();
    }
}
