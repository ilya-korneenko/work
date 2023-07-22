package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        double n1 = calculatorWithMathExtends.mult(15, 7);
        double n2 = calculatorWithMathExtends.div(28, 5);
        n2 = calculatorWithMathExtends.degree(n2, 2);
        n1 = calculatorWithMathExtends.sum(4.1, n1);
        n1 = calculatorWithMathExtends.sum(n1,n2);
        System.out.println(n1);
    }

}

//4.1 + 15 * 7 + (28 / 5) * (28 / 5)
//140.45999999999998