package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.simple.CalculatorWithMathCopy;
import homework.hw_3_repeat.calcs.additional.CalculatorWithCounterAutoAgregation;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(calc);

        double nm1;
        double nm2;
        nm1 = calculator.mult(15, 7);
        nm2 = calculator.div(28, 5);
        nm2 = calculator.degree(nm2, 2);
        nm1 = calculator.sum(4.1, nm1);
        nm1 = calculator.sum(nm1,nm2);

        double result = nm1;

        System.out.println(result + "\n" + calculator.getCountOperation());
    }
}
