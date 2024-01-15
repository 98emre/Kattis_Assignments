import java.util.Scanner;

public class Monopol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfHotels = scanner.nextInt();
        int[] distances = new int[numberOfHotels];

        for (int i = 0; i < numberOfHotels; i++) {
            distances[i] = scanner.nextInt();
        }

        int totalOutcomes = 6 * 6;
        int totalWays = 0;

        for (int distance : distances) {
            for (int dice1 = 1; dice1 <= 6; dice1++) {
                
                int dice2 = distance - dice1;

                if ((dice1 + dice2) == distance && dice2>=1 && dice2<=6) {
                    totalWays++;
                }
            }
        }

        System.out.println((double) totalWays / totalOutcomes);
    }
}