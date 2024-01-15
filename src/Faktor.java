
// https://open.kattis.com/problems/faktor

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfArticles = scanner.nextInt();
        int numberOfImpact = scanner.nextInt();

        int sum = numberOfArticles * numberOfImpact;

        sum = 1+sum - numberOfArticles;
        
        System.out.println(sum);
    }
}
