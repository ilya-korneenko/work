package homework.hw_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
    @Override
    public double pow(double num, int degree) {
        return Math.pow(num, degree);
    }

    @Override
    public double module(double num) {
        return Math.abs(num);
    }

    @Override
    public double square(double num) {
        return Math.sqrt(num);
    }
}
