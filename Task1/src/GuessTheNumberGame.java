import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1, 100);
        boolean flag = true;
        int count = 0;
        System.out.println("Welcome to the Guess The Number Game.\nGuess the number in the range from 1 to 100.");
        while(flag){
            System.out.print("Enter the number you have guessed :- ");
            int guessedNumber = sc.nextInt();
            count++;
            if(guessedNumber < randomNumber){
                System.out.println("You guessed the wrong number.\nGuess some bigger number.");
            }
            else if(guessedNumber > randomNumber){
                System.out.println("You guessed the wrong number.\nGuess some smaller number.");
            }
            else{
                System.out.println("Congrats!!\nYou guessed the correct number in " + count + " chances.");
                flag = false;
            }
        }
    }
}
