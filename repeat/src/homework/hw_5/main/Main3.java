package homework.hw_5.main;

import homework.hw_5.comparator.ComparatorLengthPassword;
import homework.hw_5.comparator.ComparatorPersonNick;
import homework.hw_5.dto.Person;
import homework.hw_5.supplier.RandomRusStringSupplier;
import homework.hw_5.supplier.RandomStringFromFileSupplier;
import homework.hw_5.supplier.RandomStringSupplier;
import homework.hw_5.supplier.TruePersonSupplier;

import java.util.*;
import java.util.function.Supplier;

public class Main3 {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = new TruePersonSupplier(new RandomStringFromFileSupplier("names.txt"),
                new RandomRusStringSupplier(),
                new RandomRusStringSupplier());

        Comparator<Person> passwordLengthCmp = new ComparatorLengthPassword();
        Comparator<Person> nickCmp = new ComparatorPersonNick();
        Comparator<Person> passwordLengthAndNickCmp = passwordLengthCmp.thenComparing(nickCmp);

        List<Person> personList= new ArrayList<>();

        zadanie(personList,personSupplier,passwordLengthAndNickCmp);
        System.out.println(personList);
    }

    public static <T> void zadanie(List<T> personList, Supplier<T> personSupplier, Comparator<T> cmp){
        for (int i = 0; i < 10_000; i++) {
            personList.add(personSupplier.get());
        }

        personList.sort(cmp);

        Iterator<T> iterator = personList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(personList.toString());

    }
}
//    int sum = 0;
//    Iterator<Integer> itr = data.iterator();
//        while (itr.hasNext()){
//                Integer element = itr.next();
//                System.out.println(element);
//                sum+= element;
//                }