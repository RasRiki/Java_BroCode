import java.util.Scanner;// util è il pattern, Scanner è la class
//Ci serve per l'input

public class UserInput {
    public static void main(String[] args){

        Scanner scannerName = new Scanner(System.in); //Necessario

        System.out.print("Enter your name: ");
        String name = scannerName.nextLine();

        System.out.print("Enter your age: ");
        int age = scannerName.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scannerName.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean v = scannerName.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("You are " + age + " year old");
        System.out.println("Your gpa is :" + gpa);

        if(v)
            System.out.println("You are a student");
        else
            System.out.println("You are not a student");

        //Errore comune: Quando chiediamo in input una stringa dopo aver richiesto un int, la stringa rimarrà vuota
        //Per risolvere, inseriamo uno scannerName.nextLine(); vuoto prima di richiedere la stringa
        scannerName.close();//Buona pratica chiuderlo
    }
}
