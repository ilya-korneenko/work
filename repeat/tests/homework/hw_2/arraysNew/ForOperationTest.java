package homework.hw_2.arraysNew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForOperationTest {

    private int[] arrDivTwoLength = new int[]{9,5,4,3,89,9,41,14,11,2};
    private int[] arrNotDivTwoLength = new int[]{2,4,5,6,7,10,15};
    private ForOperation forOperation = new ForOperation();
    @Test
    void outputAllElements() {
        Assertions.assertEquals("2 4 5 6 7 10 15 ", forOperation.outputAllElements(arrNotDivTwoLength));
        Assertions.assertEquals("9 5 4 3 89 9 41 14 11 2 ", forOperation.outputAllElements(arrDivTwoLength));
    }

    @Test
    void outputEvenElements() {
        Assertions.assertEquals("4 6 10 ", forOperation.OutputEvenElements(arrNotDivTwoLength));
        Assertions.assertEquals("5 3 9 14 2 ", forOperation.OutputEvenElements(arrDivTwoLength));
    }

    @Test
    void outputReverseElements() {
        Assertions.assertEquals("15 10 7 6 5 4 2 ", forOperation.OutputReverseElements(arrNotDivTwoLength));
        Assertions.assertEquals("2 11 14 41 9 89 3 4 5 9 ", forOperation.OutputReverseElements(arrDivTwoLength));
    }
}