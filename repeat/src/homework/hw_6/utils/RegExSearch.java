package homework.hw_6.utils;

import homework.hw_6.api.ISearchEngine;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    /**
     *
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return
     */
    @Override
    public long search(String text, String word) {
        long count = 0;

        Pattern pattern = Pattern.compile("\\b" +word + "\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            count++;
        }

        return count;
    }
}
