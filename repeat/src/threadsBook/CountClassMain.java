package threadsBook;

public class CountClassMain {
    public static void main(String[] args) {
        StringBuffer txt = new StringBuffer();
        CountClass c1 = new CountClass(txt,100);
        CountClass c2 = new CountClass(txt,200);
        c1.start();
        c2.start();
        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(txt);
    }
}
