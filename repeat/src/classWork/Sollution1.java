package classWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sollution1 {
    public String gcdOfStrings(String str1, String str2) {
        if(!str1.contains(str2)){
            return "";
        }else {
            StringBuilder stringBuilder = new StringBuilder(str1);
            int indexStart = stringBuilder.indexOf(str2);
            int indexEnd = stringBuilder.lastIndexOf(str2);
            indexEnd += str2.length();
            indexStart += str2.length();
            StringBuilder word = new StringBuilder();
            for (int i = indexStart; i < str1.length(); i++) {
                word.append(str1.charAt(i));
            }
            return String.valueOf(word);
        }
    }
}
