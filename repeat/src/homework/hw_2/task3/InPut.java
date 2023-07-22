package homework.hw_2.task3;

import java.util.Scanner;

public class InPut {
    private final Scanner scanner = new Scanner(System.in);

    public double number(){
        System.out.println("Введите число возводимое в степень:\t");
        return scanner.nextDouble();
    }

    public int degree(){
        System.out.println("Введите степень:\t");
        return scanner.nextInt();
    }
}
