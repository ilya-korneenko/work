package homework.hw_3_repeat.calcs.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithMathCopyTest {

    private final CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

    @Test
    void sum() {
        Assertions.assertEquals(109.1, calculator.sum(105,4.1));
    }

    @Test
    void minus() {
    }

    @Test
    void mult() {
        Assertions.assertEquals(105,calculator.mult(15,7));
    }

    @Test
    void div() {
        Assertions.assertEquals(28.0/5, calculator.div(28,5));
    }

    @Test
    void degree() {
    }

    @Test
    void module() {
    }

    @Test
    void sqrt() {
    }
}