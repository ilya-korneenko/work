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

public class RenameBank implements IBank {
    //https://www.alfabank.by/
//    private final String URL_SITE = "https://www.alfabank.by/exchange/minsk/";

//<span class="rates-card__double-label">покупка</span>                                                    <span class="rates-card__double-value  rates-card__double-value--
    private final String URL_SITE = "https://www.mtbank.by/";
    private final String firstBlock = "currentCourse";
    private final String secondBlock = "'BYN':{";
    private final String thirdBlock = "'%s':";


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
            int indexCurrentCourse = content.indexOf(firstBlock);
            int index = content.indexOf(secondBlock,indexCurrentCourse);
            String blockToFind = String.format(thirdBlock,rate.name());
            int i = content.indexOf(blockToFind,index);
            i +=thirdBlock.length() + 1;

            String res = content.substring(i+1,content.indexOf("',",i));
            System.out.println("\n\n" + res);
            System.out.println(builder);
            return BigDecimal.valueOf(Double.parseDouble(res));
        } catch (MalformedURLException e) {
            throw new RuntimeException("Некорректный юрл для подключения", e);
        }

    }
}
