package threads;

public class ThreadUtils {
    public static void printThreadInfo() {
        Thread current = Thread.currentThread();
        System.err.println("________________");
        System.err.println("id:" + current.getId());
        System.err.println("name:" + current.getName());
        System.err.println("state:" + current.getState());
        System.err.println("group:" + current.getThreadGroup());
        System.err.println("isDaemon:" + current.isDaemon());
        System.err.println("________________");
    }
}
