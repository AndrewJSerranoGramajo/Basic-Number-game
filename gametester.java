import java.util.Scanner;
import java.util.Random;
public class gametester {
    /**
     * @param args
     */
    public static void main(String[] args){


        //create input, randomizer and random number
        Scanner magnus = new Scanner(System.in);
        Random ultra = new Random();
        int secretNumber = ultra.nextInt(1000) + 1;

        // Num of attempts & boolean for guess
        int attempts = 0;
        boolean isNumberRight = false;


        // intro to game/start of while loop
        System.out.println("Welcome to the game!");

        while (!isNumberRight){
            System.out.println("Enter a guess: ");
            int userGuess = magnus.nextInt();
            attempts++;

            if (userGuess == secretNumber){
                isNumberRight = true;
                break;
            }else if (userGuess > secretNumber){
                System.out.println("Number too high! Try guessing lower!");
                System.out.println(attempts);
            }else{
                System.out.println("Number too low! Try guessing higher!");
                System.out.println(attempts);
            }

        }
        System.out.print("Congrats you won!");
        magnus.close();
    }
}
