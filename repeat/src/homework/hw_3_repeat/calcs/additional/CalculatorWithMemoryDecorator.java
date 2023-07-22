package homework.hw_3_repeat.calcs.additional;

import homework.hw_3_repeat.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    /**
     * memory - память
     * lastOperation - значение последней операции
     */
    private double memory;
    private double lastOperation;

    /**
     * запись значения последней операции
     *
     * @param lustNumber - передаётся из вне
     */
    private void setLastOperation(double lustNumber) {
        this.lastOperation = lustNumber;
    }

    /**
     * сохраняет значение последней операции(lastOperation)
     * в переменную memory
     */
    public void saveMemory() {
        this.memory = this.lastOperation;
    }

    /**
     * выводит значение из памяти
     * и очищает память
     *
     * @return значение из переменной memory
     */
    public double getMemory() {
        double tmp = memory;
        memory = 0;
        return tmp;
    }

    ICalculator calculator;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * @return возвращает вложенный в него калькулятор
     */
    public ICalculator getCalculator() {
        return this.calculator;
    }

    public double sum(double n1, double n2) {
        setLastOperation(calculator.sum(n1, n2));
        return lastOperation;
    }

    public double minus(double n1, double n2) {
        setLastOperation(calculator.minus(n1, n2));
        return lastOperation;
    }

    public double mult(double n1, double n2) {
        setLastOperation(calculator.mult(n1, n2));
        return lastOperation;
    }

    public double div(double n1, double n2) {
        setLastOperation(calculator.div(n1, n2));
        return lastOperation;
    }

    public double degree(double num1, int degree) {
        setLastOperation(calculator.degree(num1, degree));
        return lastOperation;
    }

    public double module(double num) {
        setLastOperation(calculator.module(num));
        return lastOperation;
    }

    public double sqrt(double num) {
        setLastOperation(calculator.sqrt(num));
        return lastOperation;
    }

}
