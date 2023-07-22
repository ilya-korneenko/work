package homework.hw_5.comparator;

import homework.hw_5.dto.Person;

import java.util.Comparator;

public class ComparatorLengthPasswordAndNickPerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        int compareLength = o1.getPassword().length() - o2.getPassword().length();

        if (compareLength != 0) {
            return o1.getNick().compareTo(o2.getNick());
        }
        else {
            return compareLength;
        }
    }
}
