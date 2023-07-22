package ecseption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionVideo1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(args[0]);

        long input = 0;
        boolean exceptionExist;

        do {
            exceptionExist = false;
            try {
                System.out.println("Введите число: ");
                input = scanner.nextLong();

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Всё не совсем ок");
                exceptionExist = true;
            }

        }while (exceptionExist);

        String numberRaw = String.valueOf(input);


    }
}
