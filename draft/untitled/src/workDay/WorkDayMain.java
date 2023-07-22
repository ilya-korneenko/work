package workDay;

import java.util.Scanner;
/*
 * weekday 0 vacation 0 - true
 * weekday 0 vacation 1 - true
 * weekday 1 vacation 0 - false
 * weekday 1 vacation 1 - true
 * */
public class WorkDayMain {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        workDay proverka = new workDay();
        System.out.print("Сегодня будний день?\t");
        proverka.setWeekday(console.nextBoolean());
        console.nextLine();

        System.out.print("\nУ вас отпуск?\t");
        proverka.setVacation(console.nextBoolean());
        proverka.algorithm(proverka.getWeekday(),proverka.getVacation());

        proverka.output(proverka.getAlgorithm());
    }

}
