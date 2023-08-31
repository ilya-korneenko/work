package streams;

import collection.supplier.HumanSupplier;
import generic.dto.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        double avg = Stream
                .generate(new HumanSupplier())
                .limit(10_000).
                filter(h -> h.getAge() >13)
                .mapToInt(Human::getAge)
                .average().getAsDouble();
        System.out.println(avg);
    }
}
