package threads.runnable;

public class TimerJob implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        String oldName = current.getName();
        try {
            current.setName("Time logger");
            long start  = System.currentTimeMillis();
            while (true){
                System.out.println(current.getName()+ " Прошло " + (System.currentTimeMillis()-start) + " ms");
            }
        }finally {
            current.setName(oldName);
        }

    }
}
