package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.simple.CalculatorWithMathCopy;
import homework.hw_3_repeat.calcs.simple.CalculatorWithMathExtends;
import homework.hw_3_repeat.calcs.simple.CalculatorWithOperator;
import homework.hw_3_repeat.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(calc1);
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(calc2);
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(calc3);

        double nm1;
        double nm2;

        nm1 = calculator1.mult(15, 7);
        nm2 = calculator1.div(28, 5);
        nm2 = calculator1.degree(nm2, 2);
        nm1 = calculator1.sum(4.1, nm1);
        nm1 = calculator1.sum(nm1,nm2);

        double result = nm1;

        System.out.println(result + "\n" + calculator1.getCountOperation());
//
//        double nm1;
//        double nm2;
        nm1 = calculator2.mult(15, 7);
        nm2 = calculator2.div(28, 5);
        nm2 = calculator2.degree(nm2, 2);
        nm1 = calculator2.sum(4.1, nm1);
        nm1 = calculator2.sum(nm1,nm2);

        result = nm1;

        System.out.println(result + "\n" + calculator2.getCountOperation());
//
//        double nm1;
//        double nm2;
        nm1 = calculator3.mult(15, 7);
        nm2 = calculator3.div(28, 5);
        nm2 = calculator3.degree(nm2, 2);
        nm1 = calculator3.sum(4.1, nm1);
        nm1 = calculator3.sum(nm1,nm2);

        result = nm1;

        System.out.println(result + "\n" + calculator3.getCountOperation());
    }
}
