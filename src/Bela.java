
// https://open.kattis.com/problems/bela

import java.util.Scanner;

public class Bela {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfHands = scanner.nextInt();
        String valueOfSuit = scanner.next();

        int sum = 0;

        for (int i = 0; i < (numberOfHands<1 ? 4: 4*numberOfHands); i++) {
            sum += getCardValue(valueOfSuit, scanner.next());
        }

        scanner.close();
        System.out.println(sum);
    }

    private static int getCardValue(String valueOfSuit, String inputValue) {
        if (inputValue.contains("A")) {
            return 11;
        } else if (inputValue.contains("K")) {
            return 4;
        } else if (inputValue.contains("Q")) {
            return 3;
        } else if (inputValue.contains("J")) {
            return (inputValue.contains(valueOfSuit) ? 20 : 2);
        } else if (inputValue.contains("T")) {
            return 10;
        } else if (inputValue.contains("9")) {
            return (inputValue.contains(valueOfSuit) ? 14 : 0);
        } else {
            return 0;
        }
    }
}

