package homework.hw_5.main;

import homework.hw_5.comparator.ComparatorLengthPassword;
import homework.hw_5.createCollection.CreateCollectionPerson;
import homework.hw_5.dto.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        CreateCollectionPerson createCollectionPerson = new CreateCollectionPerson();
        ComparatorLengthPassword cmp = new ComparatorLengthPassword();

        Set<Person> hashSet = new HashSet<>();

        hashSet = createCollectionPerson.hashSet((HashSet<Person>) hashSet,100_000);
        System.out.println(hashSet);
        System.out.println(hashSet.size());

    }
}
