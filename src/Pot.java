
// https://open.kattis.com/problems/pot

import java.util.Scanner;

public class Pot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        for(int i = 0; i<n; i++){
            int number = scanner.nextInt();
            int powValue = number % 10;
            int baseValue = number / 10;

            result += Math.pow(baseValue,powValue);
        }


        System.out.println(result);

        scanner.close();
    }
}
