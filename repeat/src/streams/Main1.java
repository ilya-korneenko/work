package streams;

import collection.supplier.HumanSupplier;
import generic.dto.Human;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Human> data = new ArrayList<>();

        HumanSupplier supplier = new HumanSupplier();
        for (int i = 0; i < 10_000; i++) {
            data.add(supplier.get());
        }

        List<Human> filtered = new ArrayList<>();
        for (Human item : data) {
            if(item.getAge()>13){
                filtered.add(item);
            }
        }
        System.out.println(filtered);
        System.out.println(filtered.size());

        int sumAge = 0;
        for (Human item : filtered) {
            sumAge+= item.getAge();
        }
        System.out.println(sumAge/filtered.size());
    }
}
