package banks;

import banks.service.EmptyBank;
import banks.service.api.ERate;
import banks.service.api.IBank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите название валюты: ");
        for (ERate rate : ERate.values()) {
            System.out.println(rate.name() + " : " + rate.getDescription());
        }
        String rateNameRaw = console.nextLine();
        ERate rateName = ERate.valueOfIgnoreCase(rateNameRaw);

        IBank bank = new EmptyBank();
        BigDecimal rate = bank.getRate(rateName);
    }
}
