package Generic;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        System.out.println("hello world");

        Pair pair = new Pair<>("John", 123);
        System.out.println(pair.getFirst());
        //HashMap<Integer, Integer>

    }
}
