package homework.hw_5.supplier;

import homework.hw_5.dto.Person;
import homework.hw_5.generation.CreateName;
import homework.hw_5.generation.CreatePasswordPerson;
import homework.hw_5.generation.CreatePersonNick;
import homework.hw_5.generation.GenerationSomeStr;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierPerson implements Supplier<Person> {

    @Override
    public Person get() {
        CreateName createNamePerson = new CreateName();
        CreatePersonNick createPersonNick = new CreatePersonNick();
        CreatePasswordPerson passwordPerson = new CreatePasswordPerson();

        Person person = new Person();
        person.setName(createNamePerson.unimportantRussianStr());
        person.setNick(createPersonNick.unimportantEnglishStr());
        person.setPassword(passwordPerson.numberPassword());
        return person;
    }


}
