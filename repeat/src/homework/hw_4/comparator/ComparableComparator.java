package homework.hw_4.comparator;

import java.util.Comparator;

public class ComparableComparator implements Comparator<Comparable> {

    @Override
    public int compare(Comparable o1, Comparable o2) {
        return o1.compareTo(o2);
    }
}
