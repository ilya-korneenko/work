package banks_v2;

import banks_v2.service.api.ERate;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название валюты: ");

//        ERate rate;
        for (ERate rate: ERate.values()){
            System.out.println(rate + ": " + rate.getDescription());
        }



    }
}
