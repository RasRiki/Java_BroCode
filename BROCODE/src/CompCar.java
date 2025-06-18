public class CompCar {

    String model;
    int year;
    CompEngine engine;

    CompCar(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new CompEngine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
