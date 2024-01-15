
// https://open.kattis.com/problems/r2

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if(firstNumber <-1000 || firstNumber>1000 || secondNumber<-1000 || secondNumber>1000){
            throw new IllegalArgumentException("Number is out of bound");
        }

        int result = (secondNumber*2) - firstNumber;

        System.out.println(result);
    }
}
