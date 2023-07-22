package homework.hw_3.runners;

import homework.hw_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    //1.1 4.1 + 15 * 7 + (28 / 5) ^ 2
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double part1 = calculator.multiplication(15,7);
        double part2 = calculator.division(28,5);
        part2 = calculator.pow(part2,2);
        double result = 4.1 + part1 + part2;

        System.out.println(result);
    }
}
