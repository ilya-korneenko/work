package lamda;

public class Sort {
    public static int compareFIO(String name1, String name2){
        return name1.compareTo(name2);
    }
    public static int compareScore(double score1,double score2){
        return Double.compare(score1,score2);
    }

    public static int compareMoney(int money1, int money2){
        return money1-money2;
    }
}
