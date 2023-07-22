package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
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

//4.1 + 15 * 7 + (28 / 5) * (28 / 5)
//140.45999999999998