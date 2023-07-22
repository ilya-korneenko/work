package homework.hw_5.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RandomRusStringSupplier implements Supplier<String> {
    private ThreadLocalRandom random = ThreadLocalRandom.current();

    @Override
    public String get() {
        int size = random.nextInt(2,55);
        StringBuilder str = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            str.append(Character.toChars(random.nextInt(1072, 1103)));
        }
        return str.toString();
    }
}
