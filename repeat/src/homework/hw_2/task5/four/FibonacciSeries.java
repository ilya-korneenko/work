package homework.hw_2.task5.four;

public class FibonacciSeries {
    public int [] Fibonacci(int number){
        if(number < 0){
            return new int[]{-1};
        } else if (number == 0) {
            return new int[]{0};
        }else if(number == 1){
            return new int[]{1};
        }else {
            int[] array = new int[number];
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i < array.length; i++) {
                array[i] = array[i-2]+array[i-1];
            }
            return array;
        }
    }
}
