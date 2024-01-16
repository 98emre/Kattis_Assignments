
// https://open.kattis.com/problems/metronome

import java.util.Scanner;

public class Metronome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble() / 4;

        scanner.close();
        System.out.println(number);
    }
}
