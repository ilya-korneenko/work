package homework.hw_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива:\t");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }
}
