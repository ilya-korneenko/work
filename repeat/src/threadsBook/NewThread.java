package threadsBook;

public class NewThread extends Thread {
    public void run(){
        int counter = 0;
        while (counter<100){
            counter++;
            System.out.println(getName() + " : " + counter);
        }
    }
}
