package homework.hw_2.task4;

public class Overflow {
    private long preNumber;
    private long pastNumber;

    public long PreOverflow(long number) {
        preNumber = number;
        long temp = number;
        while (true){
            try{
                preNumber = temp;
                temp = Math.multiplyExact(temp,number);
            }catch (ArithmeticException ex){
                return preNumber;
            }
        }
    }

    public long PastOverflow(long number) {
        preNumber = PreOverflow(number);
        return preNumber*number;
    }
}