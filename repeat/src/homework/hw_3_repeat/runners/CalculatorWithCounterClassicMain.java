package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic counterClassic =new CalculatorWithCounterClassic();
        double n1;
        double n2;
        n1 = counterClassic.mult(15, 7);
        counterClassic.incrementCountOperation();
        n2 = counterClassic.div(28, 5);
        counterClassic.incrementCountOperation();
        n2 = counterClassic.degree(n2,2);
        counterClassic.incrementCountOperation();
        n1 = counterClassic.sum(4.1, n1);
        counterClassic.incrementCountOperation();
        n1 = counterClassic.sum(n1, n2);
        counterClassic.incrementCountOperation();
        long count = counterClassic.getCountOperation();
        System.out.println(count);
        System.out.println(n1);
    }
}

//4.1 + 15 * 7 + (28 / 5) * (28 / 5)
//140.45999999999998