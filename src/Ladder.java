
// https://open.kattis.com/problems/ladder

import java.util.Scanner;

public class Ladder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int v = scanner.nextInt();

        double angle = Math.toRadians(v);
        double length = h / Math.sin(angle);

        scanner.close();
        System.out.println((int) Math.ceil(length));
    }
}
