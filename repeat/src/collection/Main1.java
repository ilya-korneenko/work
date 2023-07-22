package collection;

import collection.supplier.HumanSupplier;
import generic.comparator.HumanAgeComparator;
import generic.dto.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main1 {
    public static void main(String[] args) {
        List<Human> data = new ArrayList<>();
        data = job(new HumanSupplier(),15);

        data.sort(new HumanAgeComparator());

        System.out.println(data);
    }

    public static <T> List<T> job(Supplier<? extends T> supplier, int count){
        List<T> data = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            data.add(supplier.get());
        }

        return data;
    }
}
