
// https://open.kattis.com/problems/pieceofcake2

import java.util.Scanner;

public class Pieceofcake2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        
        int L = scanner.nextInt();
        int H = scanner.nextInt();
        int V = scanner.nextInt();
        int D = 4;

        int volume = Math.max(
                Math.max(H * V * D, (L - H) * V * D),
                Math.max(H * (L - V) * D, (L - H) * (L - V) * D)
        ); 

        System.out.println(volume);
        scanner.close();
    }
}
