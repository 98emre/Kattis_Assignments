
// https://open.kattis.com/problems/lastfactorialdigit

import java.util.Scanner;

public class Lastfactorialdigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCases = scanner.nextInt();

        for(int i = 0; i<numberOfCases; i++){
            int n = scanner.nextInt();

            int sum = 1;
            
            for(int j = 2; j<=n; j++){
                sum = (sum * j) % 10;
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}
