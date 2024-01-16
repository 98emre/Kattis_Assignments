
// https://open.kattis.com/problems/sorttwonumbers

import java.util.Scanner;

public class SortTwoNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt(), secondNumber = scanner.nextInt();

        if(firstNumber > secondNumber){
            int tmp = firstNumber;

            firstNumber = secondNumber;
            secondNumber = tmp;
        }
        
        scanner.close();
        System.out.print(firstNumber + " " + secondNumber);
    }
}
