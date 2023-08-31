package streams;

import collection.supplier.HumanSupplier;
import generic.dto.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        List<Human> data = new ArrayList<>();

        HumanSupplier supplier = new HumanSupplier();
        for (int i = 0; i < 10_000; i++) {
            data.add(supplier.get());
        }

        List<Human> filtered = data.stream()
                .filter(h -> h.getAge() > 13)
                .collect(Collectors.toList());

        filtered.stream()
                .peek(h -> System.out.println(h))
                .mapToInt(h -> h.getAge())
                .peek(i-> System.out.println(i));
    }
}
