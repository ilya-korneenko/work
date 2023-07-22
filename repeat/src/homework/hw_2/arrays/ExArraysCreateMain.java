package homework.hw_2.arrays;

public class ExArraysCreateMain {
    public static void main(String[] args) {
        ArraysUtils arraysUtils = new ArraysUtils();
        ArraysIteration iteration = new ArraysIteration();


        int [] container = arraysUtils.arrayRandom(5,100);
        for (int j : container) {
            System.out.println(j);
        }
//        iteration.OutputAllElements(container);
//        System.out.println();
//        iteration.OutputEvenElements(container);
        System.out.println();
        iteration.OutputReverseElements(container);

    }
}
