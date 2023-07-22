package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
    public static void main(String[] args) {
        String txt = "Hekko world! Java best";
        Pattern pattern1 = Pattern.compile("Java");
        Pattern pattern2 = Pattern.compile(".*\\bJava\\b.*");

        Matcher matcher = pattern1.matcher(txt);
        Matcher matcher1 = pattern2.matcher(txt);

        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
    }
}
