package banks.service;

import banks.service.api.ERate;
import banks.service.api.IBank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;





public class MtbBank implements IBank {
    //private final String URL_SITE = "https://www.alfabank.by/";
    private final String URL_SITE = "https://www.mtbank.by/courses/nbrb/";
    //private String URL_SITE = "https://www.mtbank.by/courses/nbrb/";
    private final String currencyBlock = "<span class=\"rates-card__icon rates-card__icon--%s\"></span>                            <div class=\"rates-card__value\">                                <span class=\"rates-card__number\">";


    @Override
    public BigDecimal getRate(ERate rate) throws IOException {
        try {
            URL url = new URL(URL_SITE);

//            url.openConnection().getURL();
          //  URLConnection conn = new URL(url).openConnection();
            URLConnection conn = url.openConnection();
//            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setDoOutput(true);

            StringBuilder builder = new StringBuilder();

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {

                String inputLine;
                while ((inputLine = br.readLine()) != null) {
                    builder.append(inputLine);
                }
            }

            String blockToFind = String.format(currencyBlock, rate.name());
            String content = builder.toString();
            System.out.println(builder);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Некорректный URL для подключения", e);
        }
        return null;
    }
}


