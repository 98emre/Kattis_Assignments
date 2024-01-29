
// https://open.kattis.com/problems/cosmicpathoptimization

import java.util.Scanner;

public class Cosmicpathoptimization {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i<n; i++){
            int number = scanner.nextInt();
            sum += number;
        }

        sum /= n;

        System.out.println(sum);

        scanner.close();
    }
}
