package homework.hw_2.loops.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    private Factorial factorial = new Factorial();
    @Test()
    public void factor() {
        Assertions.assertEquals(720,factorial.factor(6));
        Assertions.assertEquals(120,factorial.factor(5));
        Assertions.assertEquals(1,factorial.factor(0));
    }




    @Test
    public void factorRecurs() {
        Assertions.assertEquals(720,factorial.factorRecurs(6));
        Assertions.assertEquals(120,factorial.factorRecurs(5));
        Assertions.assertEquals(1,factorial.factorRecurs(0));
    }
}