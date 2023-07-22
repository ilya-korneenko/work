package homework.hw_5.supplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RandomStringSupplierTest {
    @RepeatedTest(100)
    public void checkNotNull() {
        RandomStringSupplier randomStringSupplier = new RandomStringSupplier();
        String txt = randomStringSupplier.get();
        Assertions.assertNotEquals(null, txt);
    }

    @RepeatedTest(50)
    public void checkNotEmpty() {
        RandomStringSupplier randomStringSupplier = new RandomStringSupplier();
        String txt = randomStringSupplier.get();
        Assertions.assertNotEquals(0, txt.length());
    }
}