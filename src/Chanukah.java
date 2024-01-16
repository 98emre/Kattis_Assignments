
// https://open.kattis.com/problems/chanukah

import java.util.Scanner;

public class Chanukah {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCases = scanner.nextInt();

        for(int i = 0; i<numberOfCases; i++){
            int dataNumber = scanner.nextInt();
            int days = scanner.nextInt();

            int totalCandles = days + ((days * (days + 1)) / 2);
            System.out.println(dataNumber + " " + totalCandles);
        }

        scanner.close();
    }
}
