package book.exceptions;

public class Factorial {
    public int getFactorial(int num) throws FactorialException {
        int result =1;
        if(num < 1){
            throw new FactorialException("Число меньше 1",1);
        }

        for (int i = 1; i <= num; i++) {
            result*=i;
        }
        return result;
    }
}
