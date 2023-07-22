package homework.hw_3_repeat.calcs.additional;

import homework.hw_3_repeat.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long increment = 0;

    private void incrementCountOperation(){
        increment++;
    }

    public long getCountOperation(){
        return increment;
    }

    @Override
    public double degree(double n1, int degree) {
        incrementCountOperation();
        return super.degree(n1, degree);
    }

    @Override
    public double sqrt(double n1) {
        incrementCountOperation();
        return super.sqrt(n1);
    }

    @Override
    public double module(double n1) {
        incrementCountOperation();
        return super.module(n1);
    }

    @Override
    public double sum(double n1, double n2) {
        incrementCountOperation();
        return super.sum(n1, n2);
    }

    @Override
    public double minus(double n1, double n2) {
        incrementCountOperation();
        return super.minus(n1, n2);
    }

    @Override
    public double mult(double n1, double n2) {
        incrementCountOperation();
        return super.mult(n1, n2);
    }

    @Override
    public double div(double n1, double n2) {
        incrementCountOperation();
        return super.div(n1, n2);
    }
}
