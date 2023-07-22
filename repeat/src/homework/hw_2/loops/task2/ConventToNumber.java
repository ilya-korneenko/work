package homework.hw_2.loops.task2;

public class ConventToNumber {
    /**
     *
     * @param str строка чисел "12345"
     * @return массив чисел из этой строки
     */
    public  int [] number(String str){
        int [] arrayOfNumbers = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
           arrayOfNumbers[i] =  Integer.parseInt(String.valueOf(str.charAt(i)));

        }
        return arrayOfNumbers;
    }
}
