package homework.hw_2.task5.two;

import java.util.Random;

public class Probability {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double probabilityOfNumbers(int number) {
        double result = 0;
        Random random = new Random();
        for (int i = 0; i < number; i++) {

            if (random.nextInt(1000) % 2 == 0) {
                result++;
            }
        }
        return (result / number) * 100;
    }
}
