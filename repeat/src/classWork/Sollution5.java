package classWork;

import java.util.Arrays;

public class Sollution5 {
    public int[] productExceptSelf(int[] nums) {
        int [] tempNums = new int[nums.length];
        Arrays.fill(tempNums, 1);
        //int j = 0;
        for (int i = 0, j = 0; i < nums.length & j < nums.length; i++) {
            if(i!=j){
                tempNums[j]*=nums[i];
            }
        }

//        while(j<tempNums.length){
//            for (int i1 = 0; i1 < nums.length; i1++) {
//                if(i1!=j){
//                    tempNums[j]*=nums[i1];
//                }
//            }
//            j++;
//        }
        return tempNums;
    }
}