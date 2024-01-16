
// https://open.kattis.com/problems/flatbokuveisla

import java.util.Scanner;

public class Flatbokuveisla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int rest = (firstNumber % secondNumber);

        scanner.close();
        System.out.println(rest);
    }
    
}
