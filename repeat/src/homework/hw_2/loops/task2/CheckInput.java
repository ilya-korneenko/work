package homework.hw_2.loops.task2;

import java.util.Scanner;

public class CheckInput {
    private int[] arr;
    private final Scanner scanner = new Scanner(System.in);
    private final ConventToNumber convent = new ConventToNumber();

    public int check() {
        Algorithm algorithm = new Algorithm();
        OutPut outPut = new OutPut();

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            this.arr = convent.number(Integer.toString(number));
            return 1;
//            System.out.println(outPut.Output(ms) + algorithm.result(ms));
        } else if (scanner.hasNextDouble()) {
            return 0;
        } else if(scanner.hasNextLine()){
           return -1;
        }else {
            return 2;
        }
    }

    public boolean out(){
        int number = check();
        switch (number){
            case 0:
                System.out.println("Введено не целое число");
                return false;
            case -1:
                System.out.println("Введена строка");
                return false;
            case 2:
                System.out.println("Ты имбицил, как ты сюда попал?");
                return false;
            case 1:
return true;
        }
        return false;
    }
}
