import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){

        // Generics = A concept where you can write a class, interface, or a method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        /*ArrayList<String> fruits = new ArrayList<>();//This is a type argument

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");*/

        GenBox<String> box = new GenBox<>();

        box.setItem("banana");

        System.out.println(box.getItem());

        GenProduct<String, Double> product = new GenProduct<>("apple", 0.5);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());



    }
}
