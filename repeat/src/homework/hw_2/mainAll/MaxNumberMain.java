package homework.hw_2.mainAll;

import homework.hw_2.task5.one.Input;
import homework.hw_2.task5.one.MakeArray;
import homework.hw_2.task5.one.MaxValue;
import homework.hw_2.task5.one.NumberOfDigits;

public class MaxNumberMain {
    public static void main(String[] args) {
        Input input = new Input();
        int number = input.inPut();

        NumberOfDigits numberOfDigits = new NumberOfDigits();
        int digits = numberOfDigits.numberDigits(number);

        MakeArray makeArray = new MakeArray();
        int [] array = makeArray.Array(number,digits);

        MaxValue maxValue = new MaxValue();
        System.out.println("Наибольшая цифра в числе " + number + " :\t" +
                maxValue.MaxNumber(array,digits));
    }
}
