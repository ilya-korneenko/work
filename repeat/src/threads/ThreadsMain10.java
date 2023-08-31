package threads;

public class ThreadsMain10 {
    static int a = 0;
    static Object look = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (look) {
            for (int i = 0; i < 100_000; i++) {
                look.notify();
                try {
                    look.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                a = a + 1;
                System.err.println("+1");
                look.notify();
            }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (look) {
                for (int i = 0; i < 100_000; i++) {
                    look.notify();
                    try {
                        look.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    a = a - 1;
                System.err.println("-1");
                look.notify();
                }
            }
        });


        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(a);
    }
}
