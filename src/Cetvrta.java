
// https://open.kattis.com/problems/cetvrta

import java.util.Scanner;

public class Cetvrta {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] points = new int[3][2];

        for(int i = 0; i<3; i++){
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        int x4 = counter(points[0][0], points[1][0], points[2][0]);
        int y4 = counter(points[0][1], points[1][1], points[2][1]);

        scanner.close();
        System.out.println(x4 + " " + y4);
    }

    
    private static int counter(int a, int b, int c) {
        return ( (a==b)? c : (a == c) ? b : a);
    }
}
