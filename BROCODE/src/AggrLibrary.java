public class AggrLibrary {

    String name;
    int year;
    AggrBook[] books;

    AggrLibrary(String name, int year, AggrBook[] books){
        this.name=name;
        this.year=year;
        this.books= books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available: ");
        for(AggrBook book : books){
            System.out.println(book.displayInfo());
        }
    }
}
