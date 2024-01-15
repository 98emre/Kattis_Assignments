

// https://open.kattis.com/problems/digitswap

import java.util.Scanner;

public class Digitswap {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        char digit1 = number.charAt(0);
        char digit2 = number.charAt(1);

        String swampNumbers = String.valueOf(digit2) + String.valueOf(digit1);

        System.out.println(swampNumbers);   
    }    
}
