package homework.hw_2.mainAll;

import homework.hw_2.task4.Overflow;

public class OverflowMain {
    public static void main(String[] args) throws Exception {
     Overflow overflow = new Overflow();
        System.out.println(overflow.PreOverflow(3));
        System.out.println(overflow.PastOverflow(3));
        System.out.println("\n\n");

        System.out.println(overflow.PreOverflow(188));
        System.out.println(overflow.PastOverflow(188));
        System.out.println("\n\n");

        System.out.println(overflow.PreOverflow(-19));
        System.out.println(overflow.PastOverflow(-19));
        System.out.println("\n\n");
    }
}
