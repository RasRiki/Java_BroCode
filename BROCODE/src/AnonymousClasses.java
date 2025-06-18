public class AnonymousClasses {
    public static void main(String[] args){

        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        AnonDog dog = new AnonDog();
        AnonDog dog2 = new AnonDog(){//Al posto di creare una nuova classe, si può fare l'override di un singolo metodo usando la classe AnonDog
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog.speak();
        dog2.speak();


    }
}
