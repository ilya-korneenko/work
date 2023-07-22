package homework.hw_2.sorts;

import java.util.Arrays;

public class SortsMain {
   // public static SortsUtils utils = new SortsUtils();
    public static void OutPut(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        SortsUtils utils = new SortsUtils();
        int [] arr = new int[]{1,2,3,4,5,6};
//        utils.sort(arr);
//        OutPut(arr);
        arr = new int[]{9,1,5,99,9,9};
        System.out.println(Arrays.toString(utils.shake(arr)));
        //OutPut(arr);

    }
}
