import java.util.Scanner;
import java.util.Random;

//Seth Giorgianni This is my own work.
public class GiorgianniExercise3GuessingGame {

	public static void main(String[] args) {
		//Sets up Global Variables We will need
		Scanner reader = new Scanner(System.in);
		Random randomNumber = new Random();
		int numToGuess = randomNumber.nextInt(10001);
		boolean victory = false;
		int guesses = 0;
		int lowerLimit = 1;
		int upperLimit = 10000;
		
		//Welcomes to game.
		System.out.println("Welcome to the Random Number Guesser Game!");
		System.out.println("I am thinking of a number between 1 and 10000 can you guess what it is?");
		
		//Main Game Function runs until number is guessed.
		while (victory == false) {
			
			//Asks for initial guess
			System.out.printf("Enter a guess between %d and %d: ", lowerLimit, upperLimit);
			int playerGuess = reader.nextInt();
			
			//Makes sure guess is valid
			while (playerGuess < lowerLimit || playerGuess > upperLimit) {
				System.out.println("WHOOPS! You accidentally guessed outside the limit.");
				System.out.printf("Enter a guess between %d and %d: ", lowerLimit, upperLimit);
				playerGuess = reader.nextInt();	
			}
			
			//Checks if Guess is lower
			if (playerGuess < numToGuess) {
				System.out.println("HIGHER");
				guesses++;
				lowerLimit = playerGuess;
				
			}
			// Checks if Guess is higher
			else if (playerGuess > numToGuess) {
				System.out.println("LOWER");
				guesses++;
				upperLimit = playerGuess;
			}
			
			// Checks if Guess is right
			else if (playerGuess == numToGuess) {
				guesses++;
				victory = true;
			}
			
		}
		
		//victory screen
		System.out.println("Congrats You Guessed The Number!");
		System.out.printf("It took you %d Guesses!", guesses);
	}

}
