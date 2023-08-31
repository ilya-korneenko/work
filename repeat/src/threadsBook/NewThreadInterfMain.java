package threadsBook;

public class NewThreadInterfMain {
    public static void main(String[] args) {
        NewThreadInterf th1 = new NewThreadInterf();
        NewThreadInterf th2 = new NewThreadInterf();

        th1.start();
        th2.start();
    }

}
