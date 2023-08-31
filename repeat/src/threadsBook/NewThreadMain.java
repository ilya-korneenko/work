package threadsBook;

import static java.lang.Thread.yield;

public class NewThreadMain{
    public static void main(String[] args) {
        NewThread th = new NewThread();
        th.start();

            //если есть необходимость в более частом переключении между потоками
//        yield();
//
            //приостанавливает только тот поток, который выполняется в данный момент
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


    }
}

