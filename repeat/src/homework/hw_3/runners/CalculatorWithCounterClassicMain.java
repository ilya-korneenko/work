package homework.hw_3.runners;

import homework.hw_3.calcs.additional.CalculatorWithCounterClassic;

/**
 * переписать тк этот класс идентичен auto
 */
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double part1 = calculator.multiplication(15,7);
        calculator.incrementCountOperation();
        double part2 = calculator.division(28,5);
        calculator.incrementCountOperation();
        part2 = calculator.pow(part2,2);
        calculator.incrementCountOperation();
        double result = calculator.sum(4.1,part1);
        calculator.incrementCountOperation();
        result = calculator.sum(result,part2);
        calculator.incrementCountOperation();
        System.out.println(result + "\n" + calculator.getCountOperation());
    }
}
