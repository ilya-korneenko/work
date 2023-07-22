package ecseption;

import java.util.Scanner;

public class ExceptionsMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Нельзя поделить на 0");
        }
    }
}
