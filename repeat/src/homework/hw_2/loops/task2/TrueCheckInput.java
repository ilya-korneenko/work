package homework.hw_2.loops.task2;

import java.util.Scanner;

public class TrueCheckInput {

    private Scanner scanner = new Scanner(System.in);
    private OutPut outPut = new OutPut();

    public int[] getArr() {
        return arr;
    }

    private int[] arr;
    private ConventToNumber convent = new ConventToNumber();

    public boolean check() {
        scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            this.arr = convent.number(Integer.toString(number));
            return true;
        } else if (scanner.hasNextDouble()) {
            System.out.println("дробное");
            return false;
        } else if (scanner.hasNextLine()) {
            System.out.println("линия");
            return false;
        } else {
            System.out.println("так не бывает");
            return false;
        }
    }

    public StringBuilder out() {
        while (arr == null) {
            check();
        }

        return new StringBuilder(outPut.Output(arr));
    }
}