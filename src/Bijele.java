
// https://open.kattis.com/problems/bijele

import java.util.Scanner;

public class Bijele {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] checkPieces = {1, 1, 2, 2, 2, 8};
        int[] addedPieces = new int[6];


        for(int i = 0; i<6; i++){
            addedPieces[i] = scanner.nextInt();
        }

        for(int i =0; i<6; i++){
            System.out.println(checkPieces[i] - addedPieces[i]);
        }

        scanner.close();
    }
}
