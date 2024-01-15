
// https://open.kattis.com/problems/triarea

import java.util.Scanner;

public class Triarea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        scanner.close();

        double result = (base * height) / 2;

        System.out.println(result);
    }
}
