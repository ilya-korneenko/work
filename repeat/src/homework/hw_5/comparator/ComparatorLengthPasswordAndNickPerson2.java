package homework.hw_5.comparator;

import homework.hw_5.dto.Person;

import java.util.Comparator;

public class ComparatorLengthPasswordAndNickPerson2 implements Comparator<Person> {

    private final ComparatorLengthPassword lengthPassword;
    ComparatorLengthPasswordAndNickPerson2(){
        this.lengthPassword = new ComparatorLengthPassword();
    }
    @Override
    public int compare(Person o1, Person o2) {

        int compareLength = lengthPassword.compare(o1,o2);

        if (compareLength != 0) {
            return o1.getNick().compareTo(o2.getNick());
        }
        return compareLength;
    }
}
