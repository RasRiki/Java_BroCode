public class Polymorphism {
    public static void main(String[] args){

        // Polymorphism = "POLY" = "MANY"
        //                "MANY" = "SHAPE"
        //                Object can identify as other object.
        //                Objects can be treated as objects of a common superclass.

        PolyCar car = new PolyCar();
        PolyBike bike = new PolyBike();
        PolyBoat boat = new PolyBoat();

        car.go();
        bike.go();
        boat.go();

        PolyVehicle[] vehicles = {car, bike, boat};//Il tipo dell'array deve essere ciò che i 3 oggetti hanno in comune
        //                                           In questo caso sono tutti e 3 figli di PolyVehicle
    }
}
