package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        double num1 = calculatorWithMathCopy.mult(15, 7);
        double num2 = calculatorWithMathCopy.div(28, 5);
        num2 = calculatorWithMathCopy.degree(num2,2);
        num1 = calculatorWithMathCopy.sum(4.1, num1);
        num1= calculatorWithMathCopy.sum(num1, num2);

        System.out.println(num1);
    }
}

//4.1 + 15 * 7 + (28 / 5) * (28 / 5)
//140.45999999999998