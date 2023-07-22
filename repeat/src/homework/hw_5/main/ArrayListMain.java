package homework.hw_5.main;

import homework.hw_5.comparator.ComparatorLengthPassword;
import homework.hw_5.createCollection.CreateCollectionPerson;
import homework.hw_5.dto.Person;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        CreateCollectionPerson createCollectionPerson = new CreateCollectionPerson();
        ComparatorLengthPassword cmp = new ComparatorLengthPassword();

        List<Person> arrayLists;
        arrayLists = new ArrayList<>();
        arrayLists = createCollectionPerson.arrayList((ArrayList<Person>) arrayLists,100_000);
        arrayLists.sort(cmp);
        System.out.println(arrayLists);
    }
}
