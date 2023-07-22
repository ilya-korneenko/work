package homework.hw_3_repeat.calcs.simple;

import homework.hw_3_repeat.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double sum(double n1, double n2) {
        return n1 + n2;
    }

    public double minus(double n1, double n2) {
        return n1 - n2;
    }

    public double mult(double n1, double n2) {
        return n1 * n2;
    }

    public double div(double n1, double n2) {
        return n1 / n2;
    }

    public double degree(double num1, int degree) {
        return Math.pow(num1, degree);
    }

    public double module(double num) {
        return Math.abs(num);
    }

    public double sqrt(double num) {
        return Math.sqrt(num);
    }
}
