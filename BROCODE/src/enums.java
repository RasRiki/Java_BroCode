public class enums {
    public static void main(String[] args){

        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.

        Day day = Day.SATURDAY;

        System.out.println(day);

        switch(day){
            case MONDAY -> System.out.println("It is a weekday");
            case SATURDAY -> System.out.println("It is a weekend day");
        }

    }
}
