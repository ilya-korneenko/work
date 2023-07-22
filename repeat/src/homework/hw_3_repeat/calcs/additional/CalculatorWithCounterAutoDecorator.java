package homework.hw_3_repeat.calcs.additional;

import homework.hw_3_repeat.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    //    CalculatorWithCounterAutoDecorator calculator =
//            new CalculatorWithCounterAutoDecorator(calculator);
    private long count; //инициализирован автоматически

    private void countOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    private ICalculator calculator;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * @return возвращает, вложенный в них класс
     */
    public ICalculator getCalculator(){
        return this.calculator;
    }

    public double sum(double n1, double n2) {
        countOperation();
        return this.calculator.sum(n1, n2);
    }

    public double minus(double n1, double n2) {
        countOperation();
        return this.calculator.minus(n1, n2);
    }

    public double mult(double n1, double n2) {
        countOperation();
        return this.calculator.mult(n1, n2);
    }

    public double div(double n1, double n2) {
        countOperation();
        return this.calculator.div(n1, n2);
    }

    public double degree(double num1, int degree) {
        countOperation();
        return this.calculator.degree(num1, degree);
    }

    public double module(double num) {
        countOperation();
        return this.calculator.module(num);
    }

    public double sqrt(double num) {
        countOperation();
        return this.calculator.sqrt(num);
    }

}
