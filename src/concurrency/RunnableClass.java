package concurrency;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
        System.out.println(Thread.currentThread().getName());
    }
}
