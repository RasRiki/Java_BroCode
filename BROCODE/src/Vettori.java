import java.util.Arrays;
import java.util.Scanner;

public class Vettori {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"mela" , "arancia" , "banana" , "cocco"};

        String[] cibo = new String[3]; //Array di 3 elementi

        String[] cibi;
        int numero;

        numero = scanner.nextInt();
        cibi = new String[numero];// Array di n elementi scelti dall'utenti

        Arrays.sort(fruits);



        for(String fruit : fruits){ //FOR EACH LOOP
            System.out.println(fruit);
        }

        Arrays.fill(fruits, "mela");


    }
}
