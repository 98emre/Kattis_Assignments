import java.util.Scanner;

public class Hangman {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toUpperCase();
        String guess = scanner.nextLine().toUpperCase();

        int mistakes = 0;
        int count = 0;

        boolean[] guessed = new boolean[word.length()]; 
        
        for (int j = 0; j < guess.length(); j++) {
            char currentGuess = guess.charAt(j);
            boolean isGuessCorrect = false;

            for (int i = 0; i < word.length(); i++) {

                if (currentGuess == word.charAt(i) && !guessed[i]) {
                    guessed[i] = true; 
                    isGuessCorrect = true;
                    count++;
                }
            }

            if (!isGuessCorrect) {
                mistakes++;
                if (mistakes >= 10) { 
                    break;
                }
            }

            if (count == word.length()) { 
                System.out.println("WIN");
                scanner.close();
                return;
            }
        }

        System.out.println("LOSE");
        scanner.close();
    }
}
