package threadsBook.classAB;

public class ClassB {
    synchronized void bar(ClassA a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "   B.bar");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(" B ");
        }

        System.out.println(name + "   A.last()");
        a.last();
    }
    synchronized void last(){
        System.out.println("B.last()");
    }
}
