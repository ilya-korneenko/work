package banks_v2;

import banks_v2.service.RenameBankV2;
import banks_v2.service.api.ERate;
import banks_v2.service.api.IBank;

import java.io.IOException;
import java.math.BigDecimal;

public class MainTest {
    public static void main(String[] args) {
      IBank bank = new RenameBankV2();
        try {
            BigDecimal rate = bank.getRate(ERate.RUB);
            System.out.println(rate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
