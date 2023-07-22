package homework.hw_3.calcs.additional;

import homework.hw_3.calcs.base;
import homework.hw_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private long count = 0;

    private final CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
    private final base calc = calculator.calculator;

    private void incrementCountOperation() {
        count++;
    }

    public double sum(double num1, double num2) {
        incrementCountOperation();
        return calc.sum(num1, num2);
    }

    public double diff(double num1, double num) {
        incrementCountOperation();
        return calc.diff(num1, num);
    }

    public double multiplication(double num1, double num) {
        incrementCountOperation();
        return calc.multiplication(num1, num);
    }

    public double division(double num1, double num) {
        incrementCountOperation();
        return calc.division(num1, num);
    }

    public double pow(double num, int degree) {
        incrementCountOperation();
        return calculator.pow(num, degree);
    }

    public double module(double num) {
        incrementCountOperation();
        return calculator.module(num);
    }

    public double sqrt(double num) {
        incrementCountOperation();
        return calculator.sqrt(num);
    }

    public long getCountOperation() {
        return count;
    }
}
