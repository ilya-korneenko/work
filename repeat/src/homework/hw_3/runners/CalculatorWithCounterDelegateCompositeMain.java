package homework.hw_3.runners;

import homework.hw_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        double part1 = calculator.multiplication(15,7);
        double part2 = calculator.division(28,5);
        part2= calculator.pow(part2,2);
        double result = calculator.sum(4.1,part1);
        result = calculator.sum(result,part2);

        System.out.println(result + " " + calculator.getCountOperation());
    }
}
