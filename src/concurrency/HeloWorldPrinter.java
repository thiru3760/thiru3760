package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HeloWorldPrinter {
    public static void main(String[] args) {

        System.out.println("hellow world ");
        System.out.println(Thread.currentThread().getName());

        Thread t1 =new Thread(new RunnableClass());
        //t1.start();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new RunnableClass());
        executorService.submit(new RunnableClass());
        executorService.submit(new RunnableClass());


    }

}
