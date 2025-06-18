public class Varargs {
    public static void main(String[] args){

        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)
        System.out.println(add(1, 2, 3, 4, 5, 6));
    }
    static int add(int... numbers){//Unisce i numeri nell'array

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
    }
}
