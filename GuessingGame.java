import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("lets play a Game.I will pick a number between");
        System.out.println("1 and 100,and you try to guess it.");
        Scanner sc1 =new Scanner(System.in);
        boolean playAgain;
        do {
            playGame();
            System.out.println("would you like to pllay again ? Yes/no");
            playAgain = sc1.nextBoolean();
        }while (playAgain);
        System.out.println("Thanks for playing.Goodbye");
        }
        static void playGame(){
        int computerNumber;
        int userGuess;
        int guessCount;
        computerNumber = (int)(100 * Math.random()) +1;
        guessCount = 0;
            System.out.println();
            System.out.println("What is our first guess?");
            Scanner sc =new Scanner(System.in);
            while(true){
                userGuess = sc.nextInt();
                guessCount++;
                if(userGuess == computerNumber){
                    System.out.println("You got it in" + guessCount + "guess! My number was " + computerNumber);
                    break;
                }
                if(guessCount==10){
                    System.out.println("You didn't get the number in 10 guesses.");
                    System.out.println("You lose. My number was " + computerNumber);
                    break;
                }
                if(userGuess < computerNumber)
                    System.out.println("That's too low. Try again:");
                else if(userGuess > computerNumber)
                    System.out.println("That's too high. Try again:");
            }
            System.out.println();

    }
}
