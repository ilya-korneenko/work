package banks_v2.service;

import banks_v2.service.api.ERate;
import banks_v2.service.api.IBank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RenameBankV2 implements IBank {
    //https://www.alfabank.by/
//    private final String URL_SITE = "https://www.alfabank.by/exchange/minsk/";

//<span class="rates-card__double-label">покупка</span>                                                    <span class="rates-card__double-value  rates-card__double-value--
    private final String URL_SITE = "https://www.mtbank.by/";

    private final String REGEXP = "\'BYN\'\\:\\{\'USD\'\\:'\\d{1,}.\\d{1,}','EUR':'\\d{1,}.\\d{1,}','RUB':'\\d{1,}.\\d{1,}'";
    private String REGEXRATE = "%s':'\\d{1,}.\\d{1,}";
    private final String REGEXlAST = "\\d{1,}.\\d{1,}";
    @Override
    public BigDecimal getRate(ERate rate) throws IOException {


        try {
            // get URL content
            URL url = new URL(URL_SITE);
            URLConnection conn = url.openConnection();
            StringBuilder builder = new StringBuilder();

            // open the stream and put it into BufferedReader
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String inputLine;
                while ((inputLine = br.readLine()) != null) {
                    builder.append(inputLine);
                }
            }

            String content = builder.toString();

            Pattern pattern = Pattern.compile(REGEXP);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                String strForSearch = matcher.group(0);
                REGEXRATE = String.format(REGEXRATE,rate);

                Pattern pattern1 = Pattern.compile(REGEXRATE);
                Matcher matcher1 = pattern1.matcher(strForSearch);
                while (matcher1.find()){
                    strForSearch = (matcher1.group(0));
                    pattern1 = Pattern.compile(REGEXlAST);
                    matcher1 = pattern1.matcher(strForSearch);
                    while (matcher1.find()){
                        return BigDecimal.valueOf(Double.parseDouble(matcher1.group()));
                    }
                }

                System.out.println(matcher1.group(0));
                return BigDecimal.ZERO;
            }
            return BigDecimal.ZERO;

        } catch (MalformedURLException e) {
            throw new RuntimeException("Некорректный юрл для подключения", e);
        }

    }
}
