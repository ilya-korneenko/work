package ecseption;

import java.util.Scanner;

public class ExceptionsMain5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();

        int div = div(a,b);
        if(div!=999){
            System.out.println(div);
        }else {
            System.out.println("Нельзя поделить на 0");
        }
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
            return 999;
        }
    }
}
