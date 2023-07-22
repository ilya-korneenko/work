package homework.hw_2.task3;

public class OutPut {
    public StringBuilder outPut(double number, int degree, double result) {
        StringBuilder builder = new StringBuilder();
        builder.append(number).append(" ^ ").append(degree).append(" = ").append(result);
        return builder;
    }
}
