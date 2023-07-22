package homework.hw_2.loops.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConventToNumberTest {
    private ConventToNumber convent = new ConventToNumber();
    @Test
    public void number() {
        String txt = "123456";
        int[] arr = new int[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(arr,convent.number(txt));

    }
}