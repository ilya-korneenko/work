package homework.hw_2.task5.three;

import homework.hw_2.task5.one.MakeArray;
import homework.hw_2.task5.one.NumberOfDigits;

public class EvenAndOdd {
    public int[] EvenOdd(int number) {

        int even = 0;
        int odd = 0;


        while(number != 0){
            if (number % 2 == 0){
                even++;
            }else {
                odd++;
            }
            number/=10;
        }
        return new int[]{even, odd};
    }
}
