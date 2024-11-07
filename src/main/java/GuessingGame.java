import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
      
      // Creates a Scanner instance named 'scanner' that is sed for capturing user input throughout the game.
      Scanner scanner = new Scanner(System.in);
      
      // Displays the game's welcome message and introduction for the user.
      System.out.println();
      System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~WELCOME TO GUESSMASTER JAVA!~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
      System.out.println("\nBefore we get started, we have some questions we'd like you to answer...");
      
      // Prompts the user to enter the type of item to be stored in the jar.
      System.out.print("\nWhat type of item should fill the jar? ");
      // Reads and stores the user's input for the item type in the variable 'item'.
      String itemType = scanner.nextLine();
      // Prompts the user to enter the maximum quantity for the specified item type.
      System.out.printf("What is the maximum amount of %s? ", itemType);
      // Reads and stores the user's input for the maximum quantity in the variable 'maxNumOfItems'.
      int maxNumOfItems = scanner.nextInt();
      
       /* Creates a Jar instance named 'jar' with the specified item type and maximum quantity.This jar object will manage the game state, including the random number of items. */
      Jar jar = new Jar(itemType, maxNumOfItems);
      
      // Prompts the user to guess how many items are in the jar, within the allowed range..
      System.out.printf("%nGreat! Let's get started! How many %s are in the jar? Pick a number between 1 and %d: ", jar.getItem(), jar.getMaxNumOfItems());
      // Generates a random number of items up to the maximum and stores it in the jar.
      jar.fill();
    
      // Accumulator variable that tracks the total number of guesses the user has made.
      int numOfGuesses = 0;
      // Indicates whether the game is still active (true) or has been won (false).
      boolean isGameStillActive = true;
      
      // Loop that runs until the correct guess is made, prompting for guesses and providing feedback.
      while(isGameStillActive) {
        // Reads and stores the user's input for the guess in the variable 'guess'.
        int guess = scanner.nextInt();
        if (guess > maxNumOfItems) {
          System.out.printf("Your guess must be less than %d! Please try again: ", maxNumOfItems);
        } else if (guess > jar.getCurrentNumOfItems()) {
          numOfGuesses += 1;
          System.out.print("Your guess is too high! Please try again: ");
        } else if (guess < jar.getCurrentNumOfItems()) {
          numOfGuesses += 1;
          System.out.print("Your guess is too low! Please try again: ");
        } else {
          numOfGuesses += 1;
          isGameStillActive = false;
          
          // Displays a congratulatory message with the total attempts when the correct guess is made.
          System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~CONGRATULATIONS!~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
          System.out.printf("Look at you go! You got it in %d attempt(s)! %n", numOfGuesses);
        }
      }
    }
  }

