package homework.hw_2.task5.six;

public class Replace {
    public int replace(int number) {
        int replaceNumber = 0;

        while (number > 0) {
            replaceNumber = replaceNumber * 10 + number % 10;
            number /= 10;
        }
        return replaceNumber;
    }
}
