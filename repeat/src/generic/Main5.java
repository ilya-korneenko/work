package generic;

import generic.comparator.HumanAgeComparator;
import generic.comparator.StudentAgeComparator;
import generic.dto.Headman;

import java.util.Arrays;
import java.util.Comparator;

public class Main5 <T>{
    public static void main(String[] args) {
        int numberHeadman = 4;                              //старост будет 4, индексы(0,1,2,3)
        Headman[] headmen = new Headman[numberHeadman];
        for (int i = 0; i < numberHeadman; i++) {
            headmen[i] = new Headman();
        }

        Arrays.sort(headmen, new HumanAgeComparator());
        sortS(headmen, new HumanAgeComparator());

        Main5<Headman> headmanMain5 = new Main5<>();
        headmanMain5.sortS(headmen, new StudentAgeComparator());
        headmanMain5.sort(headmen, new HumanAgeComparator());

        Arrays.sort(headmen, new HumanAgeComparator());
    }

    public void sort(T[]d, Comparator<? super T> cmp){

    }

    public static <T> void sortS(T[] d, Comparator<T> cmp){

    }
}
