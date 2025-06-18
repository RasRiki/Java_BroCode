import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] main){

        // Arraylist = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();;

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
