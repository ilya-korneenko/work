package homework.hw_5.supplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class RandomStringFromArraySupplierTest {
    @RepeatedTest(100)
    public void checkAddName() {
        RandomStringFromArraySupplier randomStringSupplier = new RandomStringFromArraySupplier(new String[]{"Илья"});
        String txt = randomStringSupplier.get();
        Assertions.assertEquals("Илья", txt);
    }



}