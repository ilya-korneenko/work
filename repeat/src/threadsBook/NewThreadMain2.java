package threadsBook;

public class NewThreadMain2 {
    public static void main(String[] args) {
        NewThread th1 = new NewThread();
        NewThread th2 = new NewThread();
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Threads completed!!!!");
        
    }
}

