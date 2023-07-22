package generic;

import homework.hw_3_repeat.calcs.additional.CalculatorWithCounterClassic;
import homework.hw_3_repeat.calcs.api.ICalculator;
import homework.hw_3_repeat.calcs.simple.CalculatorWithMathExtends;

public class Main1 {
    public static void main(String[] args) {
        Object data = new CalculatorWithCounterClassic();
        ICalculator calculator = new CalculatorWithMathExtends();
    }
}
