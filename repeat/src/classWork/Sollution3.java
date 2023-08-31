package classWork;

import java.util.ArrayList;
import java.util.List;

public class Sollution3 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        boolean flag = true;
        for(int i = 0; i < candies.length; i++){
            for(int j = 0; j < candies.length; j++){
                if(candies[i] + extraCandies < candies[j]){
                    flag = false;
                }
            }
            if(!flag){
                result.add(false);
                flag = true;
            }else{
                result.add(true);
            }
        }
        return result;
    }
}

