package homework.hw_3.calcs.simple;

import homework.hw_3.calcs.base;

/*
3. Создать класс CalculatorWithMathCopy.
	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	3.2 В классе должны присутствовать математические методы:
		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		Скопировать базовые математические операции из CalculatorWithOperator.
		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
		 Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.

 */
public class CalculatorWithMathCopy {
    public base calculator = new CalculatorWithOperator();

    public double pow(double num, int degree) {
        return Math.pow(num, degree);
    }

    public double module(double num){
        return Math.abs(num);
    }

    public  double sqrt(double num){
        return Math.sqrt(num);
    }

}
