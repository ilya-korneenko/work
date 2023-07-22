package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main12 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(99);
        queue.add(101);
        queue.add(1);

        while (queue.size()>0) {
            System.out.println(queue.poll());
        }
    }
}
