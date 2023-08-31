package classWork;

public class Sollution2 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        } else {
            int length1 = str1.length();
            int length2 = str2.length();
            int minLength = gcd(length1,length2);
            for(int i = minLength; i<Math.max(length1,length2); i++){
                if(length1%i==0 && length2%i==0){
                    minLength = i;
                }
            }
            return str1.substring(0,minLength);
        }
    }
    private int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
}

