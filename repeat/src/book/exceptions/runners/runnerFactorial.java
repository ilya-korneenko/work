package book.exceptions.runners;

import book.exceptions.Factorial;
import book.exceptions.FactorialException;

public class runnerFactorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        try {
            int result = factorial.getFactorial(-1);
            System.out.println(result);
        }catch (FactorialException e){
            System.out.println(e.getNumber());
            System.out.println(e.getMessage());
        }
    }
}
