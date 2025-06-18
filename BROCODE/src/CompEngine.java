public class CompEngine {

    String type;

    CompEngine(String type){

        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine");
    }
}
