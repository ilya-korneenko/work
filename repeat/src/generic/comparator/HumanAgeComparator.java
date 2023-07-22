package generic.comparator;

import generic.dto.Human;

import java.util.Comparator;

public class HumanAgeComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getAge() - o2.getAge();
    }
}
