
// https://open.kattis.com/problems/ofugsnuid

import java.util.*;

public class Ofugsnuid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i<n; i++){
            numbers[i] = scanner.nextInt();
        }

        for(int i = n-1; i>=0; i--){
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
