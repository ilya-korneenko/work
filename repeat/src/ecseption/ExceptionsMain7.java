package ecseption;

import java.util.Scanner;

public class ExceptionsMain7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();

        try {
            System.out.println(div(a, b));
        }catch (ArithmeticException e){
            System.out.println("На 0 делить нельзя");
        }

    }

    /**
     * метод делит 2 числа
     * @param a 1е число
     * @param z 2е число
     * @return 999 возвращается если второе число равно 0, иначе возвращается результат деления
     */
    public static int div(int a, int z) {
            return a / z;
    }
}
