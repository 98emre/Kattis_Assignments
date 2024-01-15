
// https://open.kattis.com/problems/vefthjonatjon

import java.util.Scanner;

public class Vefthjonatjon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int first = 0;
        int second = 0;
        int third = 0;

        for(int i = 0; i<n; i++){
            String[] letters = scanner.nextLine().split(" ");
            first += (letters[0].equals("J")) ? 1 : 0;
            second += (letters[1].equals("J")) ? 1 : 0;
            third += (letters[2].equals("J")) ? 1 : 0;
        }

        int servers = Math.min(first, Math.min(second, third));

        System.out.println(servers);
    }
}
