package homework.hw_3.calcs.additional;

import homework.hw_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count = 0;

    private void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return count;
    }

    @Override
    public double pow(double num, int degree) {
        incrementCountOperation();
        return super.pow(num, degree);
    }

    @Override
    public double module(double num) {
        incrementCountOperation();
        return super.module(num);
    }

    @Override
    public double square(double num) {
        incrementCountOperation();
        return super.square(num);
    }

    @Override
    public double sum(double num1, double num2) {
        incrementCountOperation();
        return super.sum(num1, num2);
    }

    @Override
    public double diff(double num1, double num2) {
        incrementCountOperation();
        return super.diff(num1, num2);
    }

    @Override
    public double multiplication(double num1, double num2) {
        incrementCountOperation();
        return super.multiplication(num1, num2);
    }

    @Override
    public double division(double num1, double num2) {
        incrementCountOperation();
        return super.division(num1, num2);
    }
}
