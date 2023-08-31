package tinkoff;

import java.util.Scanner;

public class Kletki {
    public int moh(int minute){
        int temp =0;
        int res =4;
        if(minute == 1){
            return 1;
        } else if (minute ==2) {
            return 4;
        }else {
            temp = minute -2;
            for (int i = 0; i < temp; i++) {
                res+=4;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Kletki kletki = new Kletki();
        System.out.println("Введи количество минут: ");
        Scanner scanner = new Scanner(System.in);
        int minute = scanner.nextInt();
        int res = kletki.moh(minute);
        System.out.println(res);
    }
}


