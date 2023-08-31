package threads;

import homework.hw_3_repeat.calcs.simple.CalculatorWithMathCopy;
import homework.hw_3_repeat.calcs.simple.CalculatorWithOperator;
import threads.runnable.TimerJob;

public class Main1 {
    public static void main(String[] args) {

        Runnable timer = new TimerJob();
        Thread th = new Thread(timer);
        th.start();

        CalculatorWithOperator calculator = new CalculatorWithOperator();
        Thread current = Thread.currentThread();
        while (true) {

            double sum = calculator.sum(1, 2);
            double sqrt = calculator.sqrt(sum);
            System.out.println(current.getName() + ":" + sqrt);
        }
    }
}
