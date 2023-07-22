package homework.hw_2.loops.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {
    private Algorithm algorithm = new Algorithm();

    @Test
    void result() {
        int [] arr = new int[]{1,6,9,7,8,5};
        Assertions.assertEquals(15120, algorithm.result(arr));
        arr = new int[]{1,8,1,2,3,2,3,7,5};
        Assertions.assertEquals(10080, algorithm.result(arr));
    }
}
