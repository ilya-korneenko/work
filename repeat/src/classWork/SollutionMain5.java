package classWork;

import java.util.Arrays;

public class SollutionMain5 {
    public static void main(String[] args) {
        Sollution5 sollution5 = new Sollution5();
        int [] ms1 = {1,2,3,4};
        int [] ms2 = {-1,1,0,-3,3};
        int [] ms3 = {1,3,5,6};
        int [] ms4 = {1,0,4,6};
        int [] ms5 = {1,2,2,3};
        System.out.println(Arrays.toString(ms1) + " " + Arrays.toString(sollution5.productExceptSelf(ms1)));
        System.out.println(Arrays.toString(ms2) + " " + Arrays.toString(sollution5.productExceptSelf(ms2)));
        System.out.println(Arrays.toString(ms3) + " " + Arrays.toString(sollution5.productExceptSelf(ms3)));
        System.out.println(Arrays.toString(ms4) + " " + Arrays.toString(sollution5.productExceptSelf(ms4)));
        System.out.println(Arrays.toString(ms5) + " " + Arrays.toString(sollution5.productExceptSelf(ms5)));

    }
}