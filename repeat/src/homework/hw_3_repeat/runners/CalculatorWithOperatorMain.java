package homework.hw_3_repeat.runners;

import homework.hw_3_repeat.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        double n1 = calculatorWithOperator.mult(15, 7); //1  //105
        double n2 = calculatorWithOperator.div(28, 5);  //2     //5.6
        double n3 = calculatorWithOperator.degree(n2, 2); //3  31.36
        double n4 = calculatorWithOperator.sum(4.1, n1); //109.1
        double n5 = calculatorWithOperator.sum(n3, n4);  //140.45
        System.out.println(n5);

        System.out.println("degree ex 5 in 3 " + calculatorWithOperator.degree(5, 3));
    }
}
