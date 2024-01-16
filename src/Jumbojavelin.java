
// https://open.kattis.com/problems/jumbojavelin

import java.util.Scanner;

public class Jumbojavelin {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        int numberOfRods = scanner.nextInt();

        int sum = 0;

        for(int i = 0; i<numberOfRods; i++){
            sum += scanner.nextInt();
        }

        sum -= numberOfRods-1;
        
        scanner.close();
        System.out.println(sum);
    }
}
