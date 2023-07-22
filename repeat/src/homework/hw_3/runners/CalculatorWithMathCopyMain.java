package homework.hw_3.runners;

import homework.hw_3.calcs.base;
import homework.hw_3.calcs.simple.CalculatorWithMathCopy;
//4.1 + 15 * 7 + (28 / 5) ^ 2

public class CalculatorWithMathCopyMain {
    /**
     * @baseCalculator - базовый калькулятор(наследованный благодаря интерфейсу base(+-*))
     * @param args
     */
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        base baseCalculator = calculator.calculator;

        double part1 = baseCalculator.multiplication(15,7);
        double part2 = baseCalculator.division(28,5);
        part2 = calculator.pow(part2,2);
        double result = 4.1 + part1 + part2;
        System.out.println(result);
    }
}
