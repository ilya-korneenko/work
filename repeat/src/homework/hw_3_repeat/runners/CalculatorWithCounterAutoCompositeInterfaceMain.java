package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import homework.hw_3_repeat.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calc =
                new CalculatorWithCounterAutoAgregationInterface(calculatorWithMathCopy);

        double nm1;
        double nm2;
        nm1 = calc.mult(15, 7);
        nm2 = calc.div(28, 5);
        nm2 = calc.degree(nm2, 2);
        nm1 = calc.sum(4.1, nm1);
        nm1 = calc.sum(nm1,nm2);

        double result = nm1;

        System.out.println(result + "\n" + calc.getCountOperation());
    }
}
