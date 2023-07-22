package generic;

import homework.hw_3_repeat.calcs.api.ICalculator;
import homework.hw_3_repeat.calcs.simple.CalculatorWithOperator;

public class Main3 {
    public static void main(String[] args) {
        BoxGeneric<CalculatorWithOperator> box1 = new BoxGeneric<>();
        BoxGeneric<ICalculator> box2 = new BoxGeneric<>();
        BoxGeneric<ICalculator> box3 = new BoxGeneric<>();

        math(box1);
        math(box2);
        math(box3);
    }

    public static void math(BoxGeneric<? extends ICalculator> box){
        ICalculator calculator = box.getData();

        double mult = calculator.mult(15, 7);               //nm1
        double div = calculator.div(28, 5);                 //nm2
        double degree = calculator.degree(div, 2);   //nm2
        double firstSum = calculator.sum(4.1, mult);        //nm1
        double secondSum = calculator.sum(firstSum, degree);
    }
}
