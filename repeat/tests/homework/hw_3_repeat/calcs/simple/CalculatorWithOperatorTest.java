package homework.hw_3_repeat.calcs.simple;

import homework.hw_3_repeat.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//4.1 + 15 * 7 + (28 / 5) ^ 2
class CalculatorWithOperatorTest {
    private final ICalculator calculator = new CalculatorWithOperator();

    @Test
    public void addition(){
        Assertions.assertEquals(2, calculator.sum(1,1));
    }

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
        Assertions.assertEquals((28.0/5)* 28/5 , calculator.degree(calculator.div(28.0,5), 2));
    }

    @Test
    void module() {
    }

    @Test
    void sqrt() {
    }
}