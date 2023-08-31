package classWork;

import java.util.List;

public class mains {
    public static void main(String[] args) {
         Sollution3 sollution3 = new Sollution3();
         List<Boolean> res = sollution3.kidsWithCandies(new int[]{2, 3, 5, 1, 3},3);
        for (Boolean re : res) {
            System.out.println(re);
        }
    }
}
