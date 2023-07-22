package ecseption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionVideo1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(args[0]);

        long input = getNumber(scanner);
        boolean exceptionExist;

        String numberRaw = String.valueOf(input);


    }

    public static long getNumber(Scanner console){
        if(console.hasNextLong()){
            return console.nextLong();
        }else if (console.hasNextDouble()){
            throw new IllegalArgumentException("Ввели дробное число");
        }else {
            throw new IllegalArgumentException("Ввели строку");
        }
    }
}
