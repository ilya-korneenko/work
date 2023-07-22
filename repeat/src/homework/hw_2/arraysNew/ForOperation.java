package homework.hw_2.arraysNew;

import java.util.Arrays;
import java.util.Iterator;

public class
ForOperation implements IArraysOperation {
    /**
     *
     * @param arr - массив, который будет выводиться
     * @return строка с элементами массива через пробел
     */
    @Override
    public String outputAllElements(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Integer> iterator = Arrays.stream(arr).iterator();
        for (int i = 0; i < arr.length; i++) {
            if (iterator.hasNext()) {
                stringBuilder.append(iterator.next()).append(" ");
            }
        }
        return String.valueOf(stringBuilder);
    }

    /**
     *
     * @param arr - массив, из которого будут выводиться четные элементы
     * @return строка с чётными элементами массива через пробел
     */
    @Override
    public String OutputEvenElements(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Integer> iterator = Arrays.stream(arr).iterator();
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    stringBuilder.append(iterator.next()).append(" ");
                } else {
                    if (iterator.hasNext()) {
                        iterator.next();
                    }
                }
            }
        return String.valueOf(stringBuilder);
    }

    /**
     *
     * @param arr - массив, из которого будут выводиться элементы в обратном порядке
     * @return строка с элементами массива через пробел
     */
    @Override
    public String OutputReverseElements(int[] arr) {
        arr = createReverseArr(arr);
        return outputAllElements(arr);
    }

    /**
     *
     * @param arr - изначальный массив
     * @return массив в обратном порядке
     */
    private int[] createReverseArr(int[] arr){
        int[] ms = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i > -1; i--, j++) {
            ms[j] = arr[i];
        }
        return ms;
    }
}
