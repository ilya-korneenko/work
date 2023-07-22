package collection;

import collection.dto.Pair;
import generic.dto.Student;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main7 {

    public static void main(String[] args) {
        Pair pair1 = new Pair(1,2);
        Pair pair2 = new Pair(2,1);

        System.out.println(pair1.hashCode());
        System.out.println(pair2.hashCode());

        if(pair1.hashCode() ==pair2.hashCode()){
            if (pair1.equals(pair2)){
                System.out.println("Содержимое равное => объекты равные");
            }else {
                System.out.println("Содержимое разное => объекты разные");
            }
        }else {
            System.out.println("Объекты разные");
        }
     }
}
