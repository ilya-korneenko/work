package classWork;

public class Solution6 {

    public boolean increasingTriplet(int[] nums) {
        int ind, jnd = 0 , knd ;
        ind = nums.length;
        boolean flagFirst = false, flagSecond = false;
        for (int i = 0, i1=0, j = 1, k = 1; i1 < nums.length && j <nums.length && k <nums.length; j++) {
            if(!flagFirst) {
                if (nums[i] < nums[j] || nums[i1] < nums[j]) {
                    if (nums[i] < nums[j]) {
                        ind = i;
                        jnd = j;
                        k = jnd+1;
                    } else {
                        ind = i1;
                        jnd = j;
                        k = jnd+1;
                    }
                    flagFirst = true;
                }
            }
            if(flagFirst && !flagSecond) {
                if (nums[jnd]<nums[k]){
                    knd = k;
                    flagSecond = true;
                }
                k++;
            }
            i1++;
        }
        if(flagFirst && flagSecond){
            return true;
        }else {
            return false;
        }
    }
}
