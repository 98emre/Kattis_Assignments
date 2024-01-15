
// https://open.kattis.com/problems/leggjasaman

import java.util.Scanner;

public class Leggjasaman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;

        System.out.println(sum);
        scanner.close();
    }
}
