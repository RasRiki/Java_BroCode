public class Aggregation {
    public static void main(String[] args){

        //Aggregation = Represents a "has-a" relationship between objects.
        //              One object contains another object as part of its structure.
        //              but the contained objects/s can exist independently

        AggrBook book1 = new AggrBook("The Fellow of the Ring", 423);
        AggrBook book2 = new AggrBook("The Two Tower", 352);
        AggrBook book3 = new AggrBook("The Return of the King", 416);

        AggrBook[] books = {book1, book2, book3};

        AggrLibrary library = new AggrLibrary("NYC Public Library", 1897, books);

        library.displayInfo();
    }
}
