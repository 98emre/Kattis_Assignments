
// https://open.kattis.com/problems/gcvwr

import java.util.Scanner;

public class Gcvwr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int g = scanner.nextInt();
        int t = scanner.nextInt();

        int numberOfItems = scanner.nextInt();

        int weight = (int) ((g-t)*0.9);

        for(int i = 0; i<numberOfItems; i++){
            weight -= scanner.nextInt();
        }

        System.out.println(weight);
        scanner.close();
    }
}
