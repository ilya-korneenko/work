package homework.hw_4.comparator;

import homework.hw_4.DataContainer;

import java.util.ArrayList;
import java.util.Comparator;

public class DataContainerComparator implements Comparator<DataContainer> {
    private int count;


    @Override
    public int compare(DataContainer o1, DataContainer o2) {
        Object[] tmp = o1.getItems();
        int numberItems = tmp.length;
        return o1.hashCode() - o2.hashCode();


        //сортировка пузырьком
//        for (int i = 0; i < numberItems - 1; i++) {
//            for (int j = 0; j < numberItems - i - 1; j++) {
//                if (tmp[j + 1].hashCode() < tmp[j].hashCode()) {
//                    Object swap = tmp[j];
//                    tmp[j] = tmp[j + 1];
//                    tmp[j + 1] = swap;
//                }
//            }
//        }

//        return 0;
    }

    //ArrayList
//    @Override
//    public int compare(DataContainer o1, DataContainer o2) {
//        return o1.
//    }

}
