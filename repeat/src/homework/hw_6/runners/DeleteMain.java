package homework.hw_6.runners;

import homework.hw_6.Comparator.ComparatorTopWords;
import homework.hw_6.FileToString;
import homework.hw_6.MapInList;
import homework.hw_6.StringToSet;
import homework.hw_6.TopWordsInStr;

import java.io.IOException;
import java.util.*;

public class DeleteMain {
    public static void main(String[] args) throws IOException {
        String fileName = "WarAndPeace.txt";

        FileToString fileToString = new FileToString();
        //fileToString.fileToString(fileName);

        StringToSet stringToSet = new StringToSet();

        String ex = String.valueOf(fileToString.fileToString(fileName));

        Set<String> words =stringToSet.stringToSet(ex);

        TopWordsInStr topWordsInStr = new TopWordsInStr();
        Map<String,Integer> top = topWordsInStr.strInMap(ex);

        MapInList mapInList = new MapInList();
        List<Map.Entry<String,Integer>> listNotSort = mapInList.listWords(top);
        ComparatorTopWords cmp = new ComparatorTopWords();
        listNotSort.sort(cmp);

    }
}
