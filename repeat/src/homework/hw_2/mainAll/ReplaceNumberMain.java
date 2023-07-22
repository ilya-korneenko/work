package homework.hw_2.mainAll;

import homework.hw_2.task5.six.Replace;

import java.util.Scanner;

public class ReplaceNumberMain {
    public static void main(String[] args) {
        Replace replace = new Replace();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите желаемое число:\t");
        System.out.println("\n" + replace.replace(scanner.nextInt()));
    }
}
