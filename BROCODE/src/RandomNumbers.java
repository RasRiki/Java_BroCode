import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){

        Random nomeRandom = new Random();

        int number;
        double numberDouble;
        boolean randomBoolean;

        number = nomeRandom.nextInt(1, 7);// con 7 escluso
        numberDouble =  nomeRandom.nextDouble(0,1);
        randomBoolean = nomeRandom.nextBoolean();

        System.out.println(number);
        System.out.println(numberDouble);

    }
}
