package homework.hw_5.comparator;

import homework.hw_5.dto.Person;

import java.util.Comparator;

public class ComparatorPersonNick implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
