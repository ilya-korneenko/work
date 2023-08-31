package classWork;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int lengthfirst = lengthWord(word1);
        int lengthsecond = lengthWord(word2);
        StringBuilder stringBuilder = new StringBuilder();
        if(lengthfirst == lengthsecond){
            for(int i = 0; i < lengthsecond; i++){
                stringBuilder.append(word1.charAt(i)).append(word2.charAt(i));
            }
        }
        if(lengthfirst > lengthsecond){
            for (int i = 0; i < lengthfirst; i++) {
                stringBuilder.append(word1.charAt(i));
                if(i<lengthsecond){
                    stringBuilder.append(word2.charAt(i));
                }
            }
        }
        if(lengthfirst < lengthsecond){
            for (int i = 0; i < lengthsecond; i++) {
                if(i<lengthfirst){
                    stringBuilder.append(word1.charAt(i));
                }
                stringBuilder.append(word2.charAt(i));
            }
        }

        return String.valueOf(stringBuilder);
    }

    public int lengthWord(String word){
        return word.length();
    }
}
