package homework.hw_3.calcs.simple;

import homework.hw_3.calcs.base;

public class CalculatorWithOperator implements base {
    /**
     * @param num1 - 1 слаг
     * @param num2 - 2 слаг
     * @return сумма двух чисел
     */
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * @param num1 - уменьшаемое
     * @param num2 - вычитаемое
     * @return разность
     */
    public double diff(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * @param num1 - множитель
     * @param num2 - множитель
     * @return произведение
     */
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * @param num1 - делимое
     * @param num2 - делитель
     * @return частное(деление)
     */
    public double division(double num1, double num2) {
        return num1 / num2;
    }

    /**
     * @param num    - число возводимое в степень
     * @param degree - степень числа
     * @return возведенное в степень число
     */
    public double pow(double num, int degree) {
        double temp = num;
        for (int i = 0; i < degree - 1; i++) {
            num *= temp;
        }
        return num;
    }

    /**
     * @param num - начальное число
     * @return - модуль числа
     */
    public double module(double num) {
        if (num >= 0) {
            return num;
        } else {
            return num * (-1.0);
        }
    }

    /**
     * @param num - число, из которого извлекаем корень
     * @return квадратный корень числа
     */
    public double square(double num) {
        return Math.sqrt(num);
    }

}
