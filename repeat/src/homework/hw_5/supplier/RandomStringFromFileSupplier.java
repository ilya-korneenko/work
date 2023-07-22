package homework.hw_5.supplier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RandomStringFromFileSupplier implements Supplier<String> {
    private ThreadLocalRandom rnd = ThreadLocalRandom.current();
    private RandomStringFromArraySupplier supplier;
    private String[] names;

    public RandomStringFromFileSupplier(String path) {
        try {
            String str = Files.readString(Path.of(path));
            supplier = new RandomStringFromArraySupplier(str.split(","));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String get() {
        return supplier.get();
    }
}
