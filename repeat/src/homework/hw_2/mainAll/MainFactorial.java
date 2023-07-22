package homework.hw_2.mainAll;

import homework.hw_2.loops.task1.Factorial;
import homework.hw_2.loops.task1.outPutFactorial;
import homework.hw_2.loops.task1.testOfInput;

import java.util.Scanner;

public class MainFactorial {
    public static void main(String[] args) {
        long number = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:\t");
        number = scanner.nextLong();


        testOfInput test = new testOfInput();
        if(test.TestInput(number)) {

            Factorial factorial = new Factorial();
            outPutFactorial outPut = new outPutFactorial();
            long res = factorial.factorRecurs(number);
            System.out.println(outPut.outputfactorial(number) + res);
        }else {
            System.out.println("Явная ошибка");
        }

    }
}
