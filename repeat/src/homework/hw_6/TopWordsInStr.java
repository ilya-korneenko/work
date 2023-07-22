package homework.hw_6;

import java.util.HashMap;
import java.util.Map;

public class TopWordsInStr {
    //private String str;

    public Map<String, Integer> strInMap(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> mapOfWords = new HashMap<>();
        for (String word : words) {
            mapOfWords.put(word, 0);
        }
        for (String tmpWord : words) {

            int count = mapOfWords.get(tmpWord);
            count++;
            mapOfWords.put(tmpWord, count);

        }

        return mapOfWords;
    }
}
