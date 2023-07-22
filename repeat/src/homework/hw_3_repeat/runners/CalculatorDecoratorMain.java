package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.additional.CalculatorWithCounterAutoDecorator;
import homework.hw_3_repeat.calcs.additional.CalculatorWithCounterAutoSuper;
import homework.hw_3_repeat.calcs.additional.CalculatorWithMemory;
import homework.hw_3_repeat.calcs.additional.CalculatorWithMemoryDecorator;
import homework.hw_3_repeat.calcs.api.ICalculator;
import homework.hw_3_repeat.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoDecorator decorator = new CalculatorWithCounterAutoDecorator(
                new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double mult = decorator.mult(15, 7);               //nm1
        double div = decorator.div(28, 5);                 //nm2
        double degree = decorator.degree(div, 2);   //nm2
        double firstSum = decorator.sum(4.1, mult);        //nm1
        double secondSum = decorator.sum(firstSum, degree);

//        CalculatorWithCounterAutoDecorator calculatorWithCounterAutoDecorator;
//        if (decorator instanceof CalculatorWithCounterAutoDecorator) {
//            calculatorWithCounterAutoDecorator =(CalculatorWithCounterAutoDecorator) decorator;
//        } else {
//            return;
//        }
//        CalculatorWithMemoryDecorator calculatorWithMemoryDecorator ;
//        if (calculatorWithCounterAutoDecorator.getCalculator() instanceof CalculatorWithMemoryDecorator) {
//            calculatorWithMemoryDecorator = (CalculatorWithMemoryDecorator)calculatorWithCounterAutoDecorator.getCalculator();
//        } else {
//            return;
//        }

        System.out.println(secondSum);
        System.out.println(decorator.getCountOperation());

        ICalculator iCalculator = decorator.getCalculator();
        if(iCalculator instanceof CalculatorWithMemoryDecorator) {
            CalculatorWithMemoryDecorator memory = ((CalculatorWithMemoryDecorator) iCalculator);
            memory.saveMemory();
            System.out.println(memory.getMemory());
        }

    }
}
