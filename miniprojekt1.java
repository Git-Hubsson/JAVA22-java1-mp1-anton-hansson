import java.util.Scanner;

public class miniprojekt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int guess = 0;
            int amountOfGuesses = 0;
            int randomNumber = (int) (Math.random() * 101);
            System.out.println("There is a randomized number between 0-100 and you're gonna guess which one. Take a guess:");

            do {
                guess = sc.nextInt();
                amountOfGuesses++;

                if (!correctAnswer(guess, randomNumber)) {
                    if (guess < randomNumber) {
                        System.out.println("Your guess was lower than the randomized number, try again:");
                    }
                    else {
                        System.out.println("Your guess was higher than the randomized number, try again:");
                    }
                }
                else {
                    System.out.println("You won! You completed the game with " + amountOfGuesses + " guesses. Lets play again!");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                }
            }
            while (guess != randomNumber);
        }
    }

    static boolean correctAnswer(int x, int y) {
        return x == y;
    }
}
