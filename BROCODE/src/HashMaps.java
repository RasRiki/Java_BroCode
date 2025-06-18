import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.5);
        map.put("orange", 0.75);
        map.put("banana", 0.25);

        //map.remove("apple");

        double orangePrice = map.get("orange");

        System.out.println(map.containsKey("banana"));

    }
}
