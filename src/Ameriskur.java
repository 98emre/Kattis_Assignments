
// https://open.kattis.com/problems/ameriskur

import java.util.Scanner;

public class Ameriskur {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        double value = 0;

        for(int i = 0; i<number; i++){
            value += 0.09144;
        }

        System.out.println(value);

        scanner.close();
    }
}
