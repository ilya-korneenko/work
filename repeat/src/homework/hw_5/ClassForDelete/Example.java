package homework.hw_5.ClassForDelete;

import homework.hw_5.createCollection.CreateCollectionPerson;
import homework.hw_5.dto.Person;

import java.util.*;

public class Example {
    //private final int valueForAnimal = 100_000;
    public static void main(String[] args) {
        long valueForAnimal = 100_000l;

        List<Person> personList = new ArrayList<>();
        List<Person> personList1 = new LinkedList<>();
        Set<Person> personSet = new HashSet<>();
        Set<Person> personSet1 = new TreeSet<>();

//        CreateCollectionPerson createCollectionPerson = new CreateCollectionPerson((ArrayList<Person>) personList, valueForAnimal);
//        personList = createCollectionPerson.getList();
//
//        createCollectionPerson = new CreateCollectionPerson((LinkedList<Person>) personList1, valueForAnimal);
//        personList1 = createCollectionPerson.getList();

        System.out.println(personList);
        System.out.println("\n\n" + personList1);
    }

}
