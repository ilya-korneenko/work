package homework.hw_2.task5.one;

public class NumberOfDigits {
    public int numberDigits(int number) {
        int digits = 0;
        if (number / 10 == 0) {
            return 1;
        } else {
            while (number / 10 != 0) {
                digits++;
                number /= 10;
            }
        }
        return digits + 1;
    }
}
