package homework.hw_2.mainAll;

import homework.hw_2.task5.five.RangeInIncrements;

import java.util.Scanner;

public class RangeIncrementsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи минимум:\t");
        int min = scanner.nextInt();
        System.out.print("Введи максимум:\t");
        int max = scanner.nextInt();
        System.out.print("Введи шаг:\t");
        int step = scanner.nextInt();

        RangeInIncrements increments = new RangeInIncrements();
        String str = String.valueOf(increments.RangeIncrements(min,max,step));

        System.out.println(str);
    }
}
