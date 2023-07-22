package homework.hw_3_repeat.calcs.simple;

import homework.hw_3_repeat.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator /*implements ICalculator*/ {
    @Override
    public double degree(double n1, int degree) {
        return Math.pow(n1,degree);
    }

    @Override
    public double sqrt(double n1) {
        return Math.sqrt(n1);
    }

    @Override
    public double module(double n1) {
        return Math.abs(n1);
    }
}
