package homework.hw_5.main;

import homework.hw_5.comparator.ComparatorLengthPassword;
import homework.hw_5.createCollection.CreateCollectionPerson;
import homework.hw_5.dto.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        CreateCollectionPerson createCollectionPerson = new CreateCollectionPerson();
        ComparatorLengthPassword cmp = new ComparatorLengthPassword();

        List<Person> linkedLists;
        linkedLists = new LinkedList<>();
        linkedLists = createCollectionPerson.linkedList((LinkedList<Person>) linkedLists,100_000);
        linkedLists.sort(cmp);
        System.out.println(linkedLists);
    }
}
