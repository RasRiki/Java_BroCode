public class TWODArrays {
    public static void main(String[] args){

        // 2D Array = An array where each element is an array
        //            Useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        //String[][] groceries = {fruits, vegetables, meats};
        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "banana"},
                                {"chicken", "pork", "beef", "fish"}};

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
