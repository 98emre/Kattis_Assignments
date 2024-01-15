
// https://open.kattis.com/problems/goombastacks

import java.util.Scanner;

public class Goombastacks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        int[] goombas = new int[n];
        int[] threshold = new int[n];

        for (int i = 0; i < n; i++) {
            goombas[i] = scanner.nextInt();
            threshold[i] = scanner.nextInt();
        }

        boolean canEscape = canEscapeCave(goombas, threshold);

        if (!canEscape) {
            System.out.println("possible");
        } else {
            System.out.println("impossible");
        }

        scanner.close();
    }

    private static boolean canEscapeCave(int[] goombas, int[] threshold) {
        int totalGoombas = goombas[0]; 

        for (int i = 1; i < goombas.length; i++) {
            if (totalGoombas < threshold[i]) {
                return false; 
            }

            totalGoombas += goombas[i];
        }

        return true; 
    }
}
