package threadsBook;

public class NewThreadInterf implements Runnable{
    Thread thread;
    NewThreadInterf(){
        thread = new Thread(this);
    }

    void start(){
        thread.start();
    }

    @Override
    public void run() {
        int count = 0;
        while (count<100){
            count++;
            System.out.println(count);
        }
    }
}
