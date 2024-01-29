
// https://open.kattis.com/problems/ratingproblems

import java.util.Scanner;

public class Ratingproblems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int sum = 0;

        for(int i = 0; i<k; i++){
            int number = scanner.nextInt();
            sum += number;
        }

        int notVote = n - k;


        double min = (double) (sum + notVote *-3)/n;
        double max = (double) (sum + notVote*3)/n;

        System.out.println(min + " " + max);
        scanner.close();;
    }
}
