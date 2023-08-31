package streams;

import collection.supplier.HumanSupplier;
import generic.dto.Human;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Human> data = new ArrayList<>();

        HumanSupplier supplier = new HumanSupplier();
        for (int i = 0; i < 10_000; i++) {
            data.add(supplier.get());
        }

        double avg = data.stream().filter(h -> h.getAge() > 13)
                .mapToInt(Human::getAge)
                .average().getAsDouble();
    }
}
