
import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secretNumber1, secretNumber2, guess = 0;// guess is initialized to 0
		Random rnd = new Random();

		secretNumber1 = 1 + rnd.nextInt(1000);
		secretNumber2 = 5;

		System.out.println("I'm thinking of a number between 1 and 1000");
		System.out.print("Enter the number:");
		guess = keyboard.nextInt();

		while ((guess != secretNumber1) && (guess != secretNumber2)) {
			System.out.println("\nYou are wrong. Try again.");
			if (guess < secretNumber1) {
				System.out.println("Too low. Enter a larger number: ");
			} else {
				System.out.println("Too high. Enter a smaller number: ");
			}

			guess = keyboard.nextInt();
		}

		if (guess == secretNumber1) {
			System.out.println("You are correct. You win a prize!");
		} else {
			System.out.println("You picked the backdoor number.  You win, but no prize");
		}
		keyboard.close();
	}
}
