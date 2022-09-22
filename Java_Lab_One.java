import java.util.Scanner;  // Import the Scanner class

class Main {

        public static double convertToF(double c){
            double fahrenheit;
            fahrenheit = c*(1.8) + 32;
            return fahrenheit;
        }

    public static void main(String[] args) {

        // Question 1
        System.out.println("Question 1");
        System.out.println("---------------------------------");

        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();

        for(int i=2; i<=num/2; i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }

        //If isPrime is true then the number is prime
        if(isPrime && (num != -1 && num != 0 && num != 1))
        System.out.println(num + " is a Prime Number");
        else
        System.out.println(num + " is not a Prime Number");	
            
        System.out.println();
        // Question 2
        System.out.println("Question 2");
        System.out.println("---------------------------------");

        int a = 3;
        int b = 5;
        System.out.println("Before Switch: a = " + a + " b = " + b);
        int tempA = a;
        a = b;
        b = tempA;
        System.out.println("After Switch: a = " + a + " b = " + b);
        System.out.println();
        
        // Question 3
        System.out.println("Question 3");
        System.out.println("---------------------------------");

        System.out.println("30 degrees C in F is :");
        System.out.println(convertToF(30.00) + " degrees F");
        System.out.println();

        // Question 4
        System.out.println("Question 4");
        System.out.println("---------------------------------");

        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i%3 == 0){
                sum += i;
            }
        }
        System.out.println("Sum from 1 to 100: " + sum);
        System.out.println();

        // // Question 5
        // System.out.println("Question 5");
        // System.out.println("---------------------------------");
        // boolean guessed = false;
        // int secretNum = 25;
        // int previousGuess = -5;
        // int guesses = 0;
        
        // while (guessed == false){
        //     // System.out.println("Enter an integer guess: ");
        //     // Scanner guessScan = new Scanner(System.in);
        //     // capture the input in an integer
        //     int guessedNum = guessScan.nextInt();
            
        //     if (guessedNum == secretNum){          
        //         System.out.println("Correct!");
        //         guesses++;
        //         System.out.println("Number of guesses: " + guesses);
        //         guessScan.close();
        //         guessed = true;
                
        //     }
        //     else if (guessedNum > secretNum){
        //         System.out.println("Guessed number is too high");
        //         if (previousGuess != guessedNum){
        //             guesses++;
        //             previousGuess = guessedNum;
        //         }
        //         else {
        //             previousGuess = guessedNum;
        //         }               
        //     }
        //     else {
        //         System.out.println("Guessed number is too low");
        //         if (previousGuess != guessedNum){
        //             guesses++;
        //             previousGuess = guessedNum;
        //         }
        //         else {
        //             previousGuess = guessedNum;
        //         }
        //     }
        // }
    
    }
}
		   