package ecseption;

import java.util.Scanner;

public class ExceptionsMain6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();

        System.out.println(div(a, b));

    }

    /**
     * метод делит 2 числа
     * @param a 1е число
     * @param z 2е число
     * @return 999 возвращается если второе число равно 0, иначе возвращается результат деления
     */
    public static int div(int a, int z) {
        if(z!=0) {
            return a / z;
        }else {
            return 0;
        }
    }
}
