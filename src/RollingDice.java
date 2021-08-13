import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {

        Random coolNumberBro = new Random();

        // This says, get a random number from 1 of 6 integers
        int x = coolNumberBro.nextInt(1000);
        System.out.println("You Rolled a: " + (x+1));
    }
}
