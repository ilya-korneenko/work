package homework.hw_5.main;

import homework.hw_5.comparator.ComparatorLengthPassword;
import homework.hw_5.comparator.ComparatorLengthPasswordAndNickPerson;
import homework.hw_5.createCollection.CreateCollectionPerson;
import homework.hw_5.dto.Person;

import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        CreateCollectionPerson createCollectionPerson = new CreateCollectionPerson();
        ComparatorLengthPassword cmp = new ComparatorLengthPassword();
        ComparatorLengthPasswordAndNickPerson CMP = new ComparatorLengthPasswordAndNickPerson();
        Set<Person> treeSet = new TreeSet<>(CMP);
        treeSet=createCollectionPerson.treeSet((TreeSet<Person>) treeSet,2_000_000);
        System.out.println(treeSet);
        System.out.println(treeSet.size());
    }
}
