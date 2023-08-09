package banks;


import banks.service.api.ERate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите название валюты: ");
        for (ERate rate : ERate.values()) {
            System.out.println(rate.name() + " : " + rate.getDescription());
        }
        String rateNameRaw = console.nextLine();

//        IBank bank = new EmptyBank();
//        BigDecimal rate = bank.getRate(rateName);
    }
}
