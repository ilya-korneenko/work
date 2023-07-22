package homework.hw_2.task3;

public class Degree {
    public double raiseDegree(double number, int degree) {
        double result = 1d;
        for (int i = 0; i < degree; i++) {
            result *= (number);
        }
        return result;
    }
}
