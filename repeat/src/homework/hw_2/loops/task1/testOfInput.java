package homework.hw_2.loops.task1;

public class testOfInput {
    public boolean TestInput(long number){
        Factorial factorial = new Factorial();
        long res = factorial.factor(number);
        if(number < 0){
            return false;
        }else if(number == 0){
            return true;
        } else if (res == 0){
            System.out.println("Переполнение");
            return false;
        }
        return true;
    }
}
