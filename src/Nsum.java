

// https://open.kattis.com/problems/nsum

import java.util.Scanner;

public class Nsum {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i<numbers; i++){
            sum += scanner.nextInt();
        }

        scanner.close();
        System.out.println(sum);
    }
}
