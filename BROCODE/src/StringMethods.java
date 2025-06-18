public class StringMethods {
    public static void main(String[] args){

        String name = "Bro code";

        int length = name.length();
        char letter = name.charAt(2);
        int index = name.indexOf("r");
        int lastIndex = name.lastIndexOf("o");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();


        System.out.println(length);
        System.out.println(letter);
    }
}
