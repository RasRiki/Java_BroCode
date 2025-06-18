import java.math.*;

public class TernaryOperator {
    public static void main(String[] args){

        // Ternary operator '?' = Return 1 of 2 values if a condition is true

        //variable = {condition} ? ifTrue : ifFalse;

        int score = 55;
        int number = 4;
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

        String pariOrDispari = (number % 2 == 0) ? "PARI" : "DISPARI";

        System.out.println(pariOrDispari);
    }
}
