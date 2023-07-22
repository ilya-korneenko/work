package homework.hw_3_repeat.calcs.additional;

import homework.hw_3_repeat.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long increment = 0;

    public void incrementCountOperation() {
        increment++;
    }

    public long getCountOperation(){
        return increment;
    }
}
