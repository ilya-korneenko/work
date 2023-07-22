package homework.hw_2.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysIteration {


    public void OutputReverseElements(int[] array) {
        int[] arr = new int[array.length];
        for (int i = array.length - 1, j = 0; j< array.length; i--, j++) {
            arr[j] = array[i];  //0 4 - 1 3 - 2 2 - 3 1 - 4 0
            
        }

        OutputAllElements(arr);
    }

    public void OutputAllElements(int[] array) {
        Iterator<Integer> iterator = Arrays.stream(array).iterator();
        System.out.println("_____for i_____");
        for (int i = 0; i < array.length; i++) {
            System.out.println(iterator.next());
        }

        iterator = Arrays.stream(array).iterator();
        System.out.println("_____do....while______");
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());

        iterator = Arrays.stream(array).iterator();
        System.out.println("_____while....do______");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = Arrays.stream(array).iterator();
        System.out.println("_______foreach______");
        for (int i : array) {
            System.out.println(iterator.next());
        }
    }

    public void OutputEvenElements(int[] array) {
        Iterator<Integer> iterator = Arrays.stream(array).iterator();
        System.out.println("____for i_____");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(iterator.next());
            } else {
                iterator.next();
            }
        }

        int index = 0;
        iterator = Arrays.stream(array).iterator();
        System.out.println("_____do....while______");
        do {
            if (index % 2 != 0) {
                System.out.println(iterator.next());
            } else {
                iterator.next();
            }
            index++;
        } while (iterator.hasNext());

        iterator = Arrays.stream(array).iterator();
        index = 0;
        System.out.println("_____while....do______");
        while (iterator.hasNext()) {
            if (index % 2 != 0) {
                System.out.println(iterator.next());
            } else {
                iterator.next();
            }
            index++;
        }

        index = 0;
        iterator = Arrays.stream(array).iterator();
        System.out.println("_______foreach______");
        for (int i : array) {
            if (index % 2 != 0) {
                System.out.println(iterator.next());
            } else {
                iterator.next();
            }
            index++;
        }
    }
}
