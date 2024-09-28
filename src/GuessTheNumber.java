import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int guessNumber = random.nextInt(1, 101);
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the number?: ");
            int numInput = input.nextInt();
            if (numInput > guessNumber) {
                System.out.println("Your number is greater than the guessed number; ");
            } else if (numInput < guessNumber) {
                System.out.println("Your number is less than the hidden number");
            } else {
                System.out.println("You guessed it!");
                break;
            }
        } while (true);
        input.close();
    }
}
