import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        //SWITCHES

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il giorno: ");
        String giorno = scanner.nextLine();

        switch(giorno){
            case "Lunedi" , "Martedi" , "Mercoledi" , "Giovedi" , "Venerdi" ->
                System.out.println("E' un giorno della settimana");
            case "Sabato" -> System.out.println("E' un giorno del weekend");
            case "Domenica" -> System.out.println("E' un giorno del weekend");
            default -> System.out.println(giorno + " non è un giorno");
        }
    }
}
