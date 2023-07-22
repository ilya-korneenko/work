package homework.hw_3.calcs.additional;

import homework.hw_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count = 0;

    public void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return count;
    }
}
