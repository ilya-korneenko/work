package homework.hw_4;

import homework.hw_4.comparator.DataContainerComparator;

import java.util.Arrays;
import java.util.Comparator;

public class example {
    public static void main(String[] args) {
        Integer [] ms = new Integer[0];
        Integer [] ms2 = new Integer[2];
        Integer [] ms3 = new Integer[]{5,2,3, null, null, null, 4, 5};
        int item = 100;
        DataContainer<Object> dataContainer = new DataContainer<>(ms3);
        dataContainer.add(item);
        dataContainer.add(item);

        System.out.println(Arrays.toString(dataContainer.getItems()));
        boolean tmp = dataContainer.delete(null);
        System.out.println("delete is " + tmp + "\n" + (Arrays.toString(dataContainer.getItems())) + "|||\n");
        Object itemt = 100;
        tmp = dataContainer.delete(itemt);
        System.out.println("delete is " + tmp + "\n" +(Arrays.toString(dataContainer.getItems())) + "|||\n");

        //dataContainer.sort(new DataContainerComparator(),dataContainer);

        System.out.println(Arrays.toString(dataContainer.getItems()));
        System.out.println(dataContainer.toString());
//        Comparator comparator = new Comparator() {
//        }
//        dataContainer.sort(Comparator<Integer> );
    }
}
