
// https://open.kattis.com/problems/jackolanternjuxtaposition

import java.util.Scanner;

public class Jackolanternjuxtaposition {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int sum = 1;

        for(int i=0; i<3; i++){
            sum *= scanner.nextInt();
        }

        scanner.close();
        System.out.println(sum);
    }
}
