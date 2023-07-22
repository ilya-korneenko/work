package homework.hw_2.loops.task1;

public class Factorial {

    private long number = 0;

    public void setNumber(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public long factor(long number) {
        long result = 1;
        setNumber(number);
        if (getNumber() == 0) {
            return 1;
        } else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }

        return result;
    }

    public long factorRecurs(long number){
        if (number == 0){
            return 1;
        }else {
            return number * factorRecurs(number-1);
        }
    }
}