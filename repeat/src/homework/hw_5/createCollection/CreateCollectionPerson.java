package homework.hw_5.createCollection;

import homework.hw_5.dto.Person;
import homework.hw_5.supplier.SupplierPerson;

import java.util.*;

public class CreateCollectionPerson < C > {
    private List<Person> list;
    private Set<Person> set;
    private C collection;


    private ArrayList<Person> arrayList;
    private LinkedList<Person> linkedList;
    private TreeSet<Person> treeSet;
    private HashSet<Person> hashSet;

//    public List<Person> getList() {
//        return list;
//    }

    public List<Person> getList() {
        return list;
    }

    public Set<Person> getSet() {
        return set;
    }

    public LinkedList<Person> getLinkedList() {
        return linkedList;
    }

    public TreeSet<Person> getTreeSet() {
        return treeSet;
    }

    public HashSet<Person> getHashSet() {
        return hashSet;
    }

    SupplierPerson supplierPerson = new SupplierPerson();

//    public CreateCollectionPerson(ArrayList<Person> personArrayList, long indexOfArrayList) {
//        for (long i = 0; i < indexOfArrayList; i++) {
//            personArrayList.add(supplierPerson.get());
//        }
//        this.arrayList = personArrayList;
//    }
//
//    public CreateCollectionPerson(LinkedList<Person> personLinkedList, long indexLinkedList){
//        for (long i = 0; i < indexLinkedList; i++) {
//            personLinkedList.add(supplierPerson.get());
//        }
//        this.linkedList = personLinkedList;
//    }
//
//    public CreateCollectionPerson(HashSet<Person> personHashSet, long indexHashSet){
//        for (long i = 0; i < indexHashSet; i++) {
//            personHashSet.add(supplierPerson.get());
//        }
//        this.hashSet = personHashSet;
//    }
//
//    public CreateCollectionPerson(TreeSet<Person> personTreeSet, long indexTreeSet){
//        for (long i = 0; i < indexTreeSet; i++) {
//            personTreeSet.add(supplierPerson.get());
//        }
//        this.treeSet = personTreeSet;
//    }

    public ArrayList<Person> arrayList(ArrayList<Person> personArrayList, long indexOfArrayList){
        for (long i = 0; i < indexOfArrayList; i++) {
            personArrayList.add(supplierPerson.get());
        }
        return personArrayList;
    }

    public LinkedList<Person> linkedList(LinkedList<Person> personLinkedList, long indexLinkedList){
        for (long i = 0; i < indexLinkedList; i++) {
            personLinkedList.add(supplierPerson.get());
        }
        return personLinkedList;
    }

    public HashSet<Person> hashSet(HashSet<Person> personHashSet, long indexHashSet){
        for (long i = 0; i < indexHashSet; i++) {
            personHashSet.add(supplierPerson.get());
        }
        return personHashSet;
    }

    public TreeSet<Person> treeSet(TreeSet<Person> personTreeSet, long indexTreeSet){
        for (long i = 0; i < indexTreeSet; i++) {
            personTreeSet.add(supplierPerson.get());

        }
        return personTreeSet;


    }
}
