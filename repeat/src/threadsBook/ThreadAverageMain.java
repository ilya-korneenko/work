package threadsBook;

import java.util.ArrayList;

public class ThreadAverageMain {
    public static void main(String[] args) {
        CreateList createList = new CreateList();
        ArrayList<Integer> arrayList = createList.filling();
        ThreadAverage th1 = new ThreadAverage();
        th1.setList(arrayList);
        ThreadAverage th2 = new ThreadAverage();
        th2.setList(arrayList);
        ThreadAverage th3 = new ThreadAverage();
        th3.setList(arrayList);
        ThreadAverage th4 = new ThreadAverage();
        th4.setList(arrayList);
        ThreadAverage th5 = new ThreadAverage();
        th5.setList(arrayList);
        ThreadAverage th6 = new ThreadAverage();
        th6.setList(arrayList);
        ThreadAverage th7 = new ThreadAverage();
        th7.setList(arrayList);
        ThreadAverage th8 = new ThreadAverage();
        th8.setList(arrayList);
        ThreadAverage th9 = new ThreadAverage();
        th9.setList(arrayList);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();

    }

}
