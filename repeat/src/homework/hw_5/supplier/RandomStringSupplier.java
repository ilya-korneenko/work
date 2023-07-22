package homework.hw_5.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RandomStringSupplier implements Supplier<String> {
    private ThreadLocalRandom random = ThreadLocalRandom.current();
    private int from;
    private int to;

    /**
     * стандартные значения от а до я
     */
    public RandomStringSupplier() {
        this.from = 5;
        this.to = 10;
    }

    public RandomStringSupplier(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String get() {
        int size = random.nextInt(from, to);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(Character.toChars(random.nextInt(65, 122)));
        }
        return str.toString();
    }
}
