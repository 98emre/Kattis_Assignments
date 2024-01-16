
// https://open.kattis.com/problems/filip

import java.util.Scanner;

public class Filip {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        
        int firstNumber = Integer.parseInt(sb.append(scanner.nextInt()).reverse().toString());
        sb = new StringBuilder();

        int secondNumber = Integer.parseInt(sb.append(scanner.nextInt()).reverse().toString());

        scanner.close();
        System.out.println((firstNumber>secondNumber?firstNumber:secondNumber));
         
    }
}
