package concurrency.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {

    private ArrayList<Integer> list;
    private int n;

    public ArrayCreator(int n) {

        this.n = n;
        list = new ArrayList<Integer>();

    }

    @Override
    public ArrayList<Integer> call() {

        for (int i = 1; i <= n; i++) {

            list.add(i);
        }

        return list;

    }


}