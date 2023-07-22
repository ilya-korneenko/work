package homework.hw_5.comparator;

import homework.hw_5.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimalNick implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
