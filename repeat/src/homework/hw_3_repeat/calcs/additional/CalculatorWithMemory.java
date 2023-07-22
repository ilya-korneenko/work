package homework.hw_3_repeat.calcs.additional;

import homework.hw_3_repeat.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator{
    ICalculator iCalculator;
    public CalculatorWithMemory(ICalculator calculator){
        this.iCalculator = calculator;
    }

    private double memory;
    private double lastOperation;

    /**данный метод записывает значение последней операции
     *
     * @param lustNumber - переданное "последнее" значение
     */
    private void setLastOperation(double lustNumber){
        lastOperation = lustNumber;
    }

    /**
     * сохраняет последнее значение в память
     */
    public void saveMemory(){
        memory = lastOperation;
    }

    /**
     * выводит значение из memory
     * затем очищает memory
     * @return возвращает значение memory
     */
    public double getMemory(){
        double tmp = memory;
        memory = 0;
        return tmp;
    }

    public double sum(double n1, double n2) {
        setLastOperation(iCalculator.sum(n1, n2));
        return lastOperation;
    }

    public double minus(double n1, double n2) {
        setLastOperation(iCalculator.minus(n1, n2));
        return lastOperation;
    }

    public double mult(double n1, double n2) {
        setLastOperation(iCalculator.mult(n1, n2));
        return lastOperation;
    }

    public double div(double n1, double n2) {
        setLastOperation(iCalculator.div(n1, n2));
        return lastOperation;
    }

    public double degree(double num1, int degree) {
        setLastOperation(iCalculator.degree(num1, degree));
        return lastOperation;
    }

    public double module(double num) {
        setLastOperation(iCalculator.module(num));
        return lastOperation;
    }

    public double sqrt(double num) {
        setLastOperation(iCalculator.sqrt(num));
        return lastOperation;
    }
}
