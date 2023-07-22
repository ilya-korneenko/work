package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.additional.CalculatorWithMemory;
import homework.hw_3_repeat.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {


        CalculatorWithMemory calculator =
                new CalculatorWithMemory(new CalculatorWithOperator());

        double mult = calculator.mult(15, 7);               //nm1
        double div = calculator.div(28, 5);                 //nm2
        double degree = calculator.degree(div, 2);   //nm2
        double firstSum = calculator.sum(4.1, mult);        //nm1
        double secondSum = calculator.sum(firstSum, degree);

        calculator.saveMemory();
        double result = calculator.getMemory();
        System.out.println(result);

    }
}




