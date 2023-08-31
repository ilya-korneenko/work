package homework.hw_6_threads;

public class Main {
    public static void main(String[] args) {
        ThreadWars threadWars = new ThreadWars();
        Thread thread =  new Thread(threadWars);
        thread.start();
    }
}
