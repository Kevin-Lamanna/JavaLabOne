import java.util.Scanner;  // Import the Scanner class

class LabOneQ5 {
    public static void main(String[] args) {

        // Question 5
        System.out.println("Question 5");
        System.out.println("---------------------------------");
        boolean guessed = false;
        int secretNum = 25;
        int previousGuess = -5;
        int guesses = 0;
        
        while (guessed == false){
            System.out.println("Enter an integer guess: ");
            Scanner guessScan = new Scanner(System.in);
            // capture the input in an integer
            int guessedNum = guessScan.nextInt();
            
            if (guessedNum == secretNum){          
                System.out.println("Correct!");
                guesses++;
                System.out.println("Number of guesses: " + guesses);
                guessScan.close();
                guessed = true;
                
            }
            else if (guessedNum > secretNum){
                System.out.println("Guessed number is too high");
                if (previousGuess != guessedNum){
                    guesses++;
                    previousGuess = guessedNum;
                }
                else {
                    previousGuess = guessedNum;
                }               
            }
            else {
                System.out.println("Guessed number is too low");
                if (previousGuess != guessedNum){
                    guesses++;
                    previousGuess = guessedNum;
                }
                else {
                    previousGuess = guessedNum;
                }
            }
        }

    }
}