package homework.hw_2.task5.four;

public class OutputFibonacci {
    public void Output(int[] array) {
        if (array[0] == -1) {
            System.out.println("Ошибка ввода, диапазон обязан быть " +
                    "положительным");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i + 1 != array.length) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.print(array[i]);
                }
            }
        }
    }
}
