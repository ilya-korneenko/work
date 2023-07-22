package homework.hw_6;

import java.util.*;

public class StringToSet {
    private final Set<String> wordsSet = new HashSet<String>();

//    public Set<String> getWordsSet() {
//        return wordsSet;
//    }
////58103
    public Set<String> stringToSet(String str){
        String[] words = str.split(" ");

        //        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            wordsSet.add(words[i]);
//        }

        /* верх и низ взаимозаменяемы */

        wordsSet.addAll(Arrays.asList(words));
        return wordsSet;
    }
}
