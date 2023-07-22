package homework.hw_2.sorts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortsUtilsTest {

    private SortsUtils sortsUtils = new SortsUtils();
    @Test
    public void sort() {
        int[] arr = new int[]{9,5,74,2,35,16};
        int[] ms = sortsUtils.sort(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);

        arr = new int[]{1,2,3,4,5,6};
        ms= sortsUtils.sort(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);

        arr = new int[]{1,1,1,1};
        ms= sortsUtils.sort(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);

        arr = new int[]{9,1,5,99,9,9};
        ms= sortsUtils.sort(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);

        arr = new int[]{};
        ms= sortsUtils.sort(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);

        arr = new int[]{6,5,4,3,2,1};
        ms= sortsUtils.sort(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);
    }


    @Test
    public void shake() {
        int[] arr = new int[]{9,1,5,99,9,9};
        int[] ms = sortsUtils.shake(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);

        arr = new int[]{};
        ms= sortsUtils.shake(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);

        arr = new int[]{6,5,4,3,2,1};
        ms= sortsUtils.shake(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);

        arr = new int[]{9,5,74,2,35,16};
        ms = sortsUtils.shake(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);

        arr = new int[]{1,1,1,1};
        ms= sortsUtils.shake(arr);
        Assertions.assertArrayEquals(Arrays.stream(arr).sorted().toArray(),ms);
    }
}
