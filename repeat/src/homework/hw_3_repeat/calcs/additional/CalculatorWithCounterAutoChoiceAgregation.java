package homework.hw_3_repeat.calcs.additional;


import homework.hw_3_repeat.calcs.simple.CalculatorWithMathCopy;
import homework.hw_3_repeat.calcs.simple.CalculatorWithMathExtends;
import homework.hw_3_repeat.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private long count;

    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;


    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calc1 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calc2 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calc3 = calculator;
    }

    private void countOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public double sum(double n1, double n2) {
        countOperation();
        if (calc1 != null) {
            return this.calc1.sum(n1, n2);
        } else if (calc2 != null) {
            return this.calc2.sum(n1, n2);
        } else
            return this.calc3.sum(n1, n2);

    }

    public double minus(double n1, double n2) {
        countOperation();
        if (calc1 != null) {
            return this.calc1.minus(n1, n2);
        } else if (calc2 != null) {
            return this.calc2.minus(n1, n2);
        } else
            return this.calc3.minus(n1, n2);

    }

    public double mult(double n1, double n2) {
        countOperation();
        if(calc1!=null) {
            return this.calc1.mult(n1, n2);
        } else if (calc2!=null) {
            return this.calc2.mult(n1, n2);
        }else
            return this.calc3.mult(n1, n2);

    }

    public double div(double n1, double n2) {
        countOperation();
        if(calc1!=null) {
            return this.calc1.div(n1, n2);
        } else if (calc2!=null) {
            return this.calc2.div(n1, n2);
        }else
            return this.calc3.div(n1, n2);

    }

    public double degree(double num1, int degree) {
        countOperation();
        if(calc1!=null) {
            return this.calc1.degree(num1, degree);
        } else if (calc2!=null) {
            return this.calc2.degree(num1, degree);
        }else
            return this.calc3.degree(num1, degree);

    }

    public double module(double num) {
        countOperation();
        if(calc1!=null) {
            return this.calc1.module(num);
        } else if (calc2!=null) {
            return this.calc2.module(num);
        }else
            return this.calc3.module(num);

    }

    public double sqrt(double num) {
        countOperation();
        if(calc1!=null) {
            return this.calc1.sqrt(num);
        } else if (calc2!=null) {
            return this.calc2.sqrt(num);
        }else
            return this.calc3.sqrt(num);

    }
}
