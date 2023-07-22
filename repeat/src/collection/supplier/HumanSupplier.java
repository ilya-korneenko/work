package collection.supplier;

import generic.dto.Human;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class HumanSupplier implements Supplier<Human> {

    @Override
    public Human get() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        Human result = new Human();
        result.setAge(rnd.nextInt(10,15));

        return result;
    }
}
