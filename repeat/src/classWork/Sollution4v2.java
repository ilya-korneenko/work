package classWork;

public class Sollution4v2 {
    public String reverseWords(String s) {
        String temp = deleteSpacesRegex(s);
        String[] words = temp.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);
            stringBuilder.append(" ");
        }
        return String.valueOf(stringBuilder).trim();

    }

    private String deleteSpacesRegex(String s) {
        while (s.contains("  ")) {
            s = s.replace("  ", " ").trim();
        }
        return s;
    }
}

/**
 *     public String reverseWords(String s) {
 *         String temp = deleteSpacesRegex(s);
 *         String[] words = arrayWords(temp);
 *         s = reverse(words);
 *         return s;
 *     }
 *
 *     private String deleteSpacesRegex(String s){
 *         while(s.contains("  ")) {
 *             s= s.replace("  ", " ").trim();
 *         }
 *         return s;
 *     }
 *
 *     private String[] arrayWords(String s){
 *         return s.split(" ");
 *     }
 *
 *     private String reverse(String[] words){
 *         StringBuilder stringBuilder = new StringBuilder();
 *         for (int i = words.length - 1; i >= 0; i--) {
 *             stringBuilder.append(words[i]);
 *             stringBuilder.append(" ");
 *         }
 *         String temp = String.valueOf(stringBuilder);
 *         return temp.trim();
 *
 *     }
 */