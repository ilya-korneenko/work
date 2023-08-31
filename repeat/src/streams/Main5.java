package streams;

import collection.supplier.HumanSupplier;
import generic.dto.Human;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
         Stream<Human> generate = Stream.generate(new HumanSupplier());
         Stream<Human> limit = generate.limit(10_000);
         Stream<Human> filter = limit.filter(h -> h.getAge() >13);
         IntStream map = filter.mapToInt(Human::getAge);

    }
}
