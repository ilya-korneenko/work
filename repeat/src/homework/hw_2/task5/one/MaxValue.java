package homework.hw_2.task5.one;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxValue {
    public int MaxNumber(int[] array, int digits) {
        if (digits == 1) {
            return array[0];
        } else {
            Arrays.sort(array);
            return array[digits - 1];
        }

    }
}
