package homework.hw_5.supplier;

import homework.hw_5.dto.Person;

import java.util.function.Supplier;

public class TruePersonSupplier implements Supplier<Person> {
    private final Supplier<String> generateName;
    private final Supplier<String> generateNick;
    private final Supplier<String> generatePassword;

    public TruePersonSupplier(){
        this.generateName = new RandomStringSupplier();
        this.generateNick = new RandomStringSupplier();
        this.generatePassword = new RandomStringSupplier(5,10);
    }
    public TruePersonSupplier(Supplier<String> generateName,
                              Supplier<String> generateNick,
                              Supplier<String> generatePassword) {
        this.generateName = generateName;
        this.generateNick = generateNick;
        this.generatePassword = generatePassword;
    }

    @Override
    public Person get() {
        Person person = new Person();
        person.setName(generateName.get());
        person.setNick(generateNick.get());
        person.setPassword(generatePassword.get());

        return person;
    }
}
