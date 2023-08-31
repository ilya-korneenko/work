package threadsBook.classAB;

public class ClassA {
    synchronized void foo(ClassB b){
        String name = Thread.currentThread().getName();
        System.out.println(name + "   A.foo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception at A");
        }

        System.out.println(name + "    SecondClass.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println("  _A.last()_");
    }
}
