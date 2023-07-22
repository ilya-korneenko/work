package homework.hw_5.supplier;

import homework.hw_5.dto.Animal;
import homework.hw_5.dto.Person;
import homework.hw_5.generation.CreateAnimalNick;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierAnimal implements Supplier<Animal> {
    @Override
    public Animal get() {
        CreateAnimalNick animalNick = new CreateAnimalNick();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Animal exampleAnimal = new Animal();
        exampleAnimal.setAge(random.nextInt(1,100));
        exampleAnimal.setNick(animalNick.importantStrTrueNicks());
        return exampleAnimal;
    }
}
