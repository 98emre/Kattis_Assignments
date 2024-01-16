
// https://open.kattis.com/problems/twosum

import java.util.Scanner;

public class Twosum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        scanner.close();
        System.out.println(sum);
    }
}
