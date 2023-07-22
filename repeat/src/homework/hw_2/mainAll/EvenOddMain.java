package homework.hw_2.mainAll;

import homework.hw_2.task5.three.EvenAndOdd;

import java.util.Scanner;

public class EvenOddMain {
    public static void main(String[] args) {
        EvenAndOdd evenAndOdd = new EvenAndOdd();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число: ");
        int number = scanner.nextInt();
        int[] arr = evenAndOdd.EvenOdd(number);

        int even = arr[0];
        int odd = arr[1];

        System.out.println("В числе " + number + "\n");
        System.out.println("Чётных ---> " + even + "\nНечётных ---> " + odd);

    }
}
