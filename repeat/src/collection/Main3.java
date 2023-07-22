package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> data = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            data.add(rnd.nextInt(100));
        }

        System.out.println(data);
        int sum = 0;
        Iterator<Integer> itr = data.iterator();
        while (itr.hasNext()){
            Integer element = itr.next();
            System.out.println(element);
            sum+= element;
        }
        System.out.println("Сумма элементов: " + sum);
    }

}
