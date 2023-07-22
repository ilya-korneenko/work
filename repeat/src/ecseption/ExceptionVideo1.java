package ecseption;

import homework.hw_2.sorts.SortsUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionVideo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(args[0]);


        try {
            System.out.println("Введите число: ");
            long input = scanner.nextLong();
            System.out.println("Всё ок");
            String numberRaw = String.valueOf(input);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("Всё не совсем ок");
        }


    }
}
