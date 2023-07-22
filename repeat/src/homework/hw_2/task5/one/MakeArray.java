package homework.hw_2.task5.one;

public class MakeArray {
    public int[] Array(int number, int digits) {
        int[] array = new int[digits];
        if (digits == 0) {
            return new int[]{number};
        } else {
//            int[] array = new int[digits];
            for (int i = 0; i < array.length; i++) {
                array[i] = number % 10;
                number /= 10;
            }
        }
        return array;
    }
}
