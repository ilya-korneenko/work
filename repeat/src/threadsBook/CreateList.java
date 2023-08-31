package threadsBook;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CreateList {

    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    public ArrayList<Integer> filling() {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumbers.add(rnd.nextInt(1, 100));
        }
        return listNumbers;

    }

    public double AverageCollection(List<Integer> numbers) {
        int average = 0;
        for (Integer number : numbers) {
            average += number;
        }
        return average/10;
    }

}
