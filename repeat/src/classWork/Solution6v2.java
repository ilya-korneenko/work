package classWork;

import java.util.Arrays;

public class Solution6v2 {
    public boolean increasingTriplet(int[] nums) {
        //
        // nums = Arrays.stream(nums).distinct().toArray();
        String numbers = Arrays.toString(nums);
        numbers=numbers.replaceAll(",","");
        numbers = numbers.replaceAll("\\[","");
        numbers = numbers.replaceAll("\\]","");
        numbers = numbers.replaceAll("(1,9)\\1+", "$1");
        int start = 0, jnd = 0, end = nums.length -1 ;
        int [][] minMax = new int[2][nums.length];
        Arrays.fill(minMax[0],-9999);
        Arrays.fill(minMax[1],-9999);
        for (int i = 1; i < nums.length; i++) {
            for(;start<i||i<end;start++,end--) {            //i>end
                if (  i >= start&&start< nums.length) {
                    if (nums[i] > nums[start]) {
                        minMax[0][i] = nums[start];
                    }
                }
                if (i < end && end>=0) {
                    if (nums[i] < nums[end]){
                        minMax[1][i] = nums[end];
                    }
                }
                if(end<0&&start> nums.length-1){
                    break;
                }
            }
            start=0;end= nums.length-1;
        }
        for (int i = 0; i < minMax[0].length; i++) {
            if(minMax[0][i]!=-9999 && minMax[1][i]!=-9999){
                return true;
            }
        }
        return false;
    }
}
