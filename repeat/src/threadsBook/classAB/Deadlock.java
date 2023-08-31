package threadsBook.classAB;

public class Deadlock implements Runnable{
    ClassA a = new ClassA();
    ClassB b = new ClassB();

    Deadlock(){
        Thread.currentThread().setName(" 1 ");
        Thread t = new Thread(this, " 2 ");
        t.start();
        a.foo(b);
    }
    @Override
    public void run() {
        b.bar(a);
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
