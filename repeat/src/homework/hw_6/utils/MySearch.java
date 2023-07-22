package homework.hw_6.utils;

import homework.hw_6.TopWordsInStr;
import homework.hw_6.api.ISearchEngine;

import java.util.HashMap;
import java.util.Map;

public class MySearch implements ISearchEngine {

    private final TopWordsInStr topWordsInStr = new TopWordsInStr();

    @Override
    public long search(String text, String word) {
        Map<String, Integer> mapWordsText = new HashMap<>();
        mapWordsText = topWordsInStr.strInMap(text);
        return mapWordsText.get(word);
    }
}
