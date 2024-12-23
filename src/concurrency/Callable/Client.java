package concurrency.Callable;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ExecutorService executor = Executors.newFixedThreadPool(1);



        ArrayCreator arr = new ArrayCreator(n);

        //Thread t1 = new Thread(arr);

        Future<ArrayList<Integer>> ans = executor.submit(arr);

        ArrayList<Integer> list = ans.get();

        System.out.println(list);

        executor.shutdown();


    }
}