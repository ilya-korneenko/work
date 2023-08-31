package threadsBook;

public class CountClass extends Thread{
    private final StringBuffer txt;
    private final int countTo;

    public CountClass(StringBuffer s, int c){
        txt = s;
        countTo = c;
    }

    @Override
    public void run() {
        synchronized (txt){
            int sum = 0;
            for (int i = 0; i < countTo; i++) {
                sum+=i;
                txt.append("Next value = ").append(i).append("\n");
            }
            txt.append("\nsum = ").append(sum).append("\n");
//            System.out.println(txt);
        }
    }
}
