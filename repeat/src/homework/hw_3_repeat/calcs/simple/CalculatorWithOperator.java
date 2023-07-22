package homework.hw_3_repeat.calcs.simple;

import homework.hw_3_repeat.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
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

    public double degree(double n1, int degree) {
        double tmp = 1;
        for (int i = degree; i > 0; i--) {
            tmp *= n1;
        }
        return tmp;
    }

    public double module(double n1) {
        if (n1 >= 0)
            return n1;
        else
            return -n1 ;

//        return n1<0? -n1 : n1;
    }

    public double sqrt(double n1){
        return Math.sqrt(n1);
    }
}
