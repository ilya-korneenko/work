package homework.hw_2.mainAll;

import homework.hw_2.task5.four.FibonacciSeries;
import homework.hw_2.task5.four.OutputFibonacci;

import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        OutputFibonacci outputFibonacci = new OutputFibonacci();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи диапазон ряда Фибоначчи:\t ");
        int range = scanner.nextInt();
        int[] fibonacci = fibonacciSeries.Fibonacci(range);
        outputFibonacci.Output(fibonacci);
    }
}
