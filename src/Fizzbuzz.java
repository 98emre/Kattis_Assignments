
// https://open.kattis.com/problems/fizzbuzz

import java.util.Scanner;

public class Fizzbuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int numbers = scanner.nextInt();

        for(int i = 1; i<=numbers; i++){
            if(i % x == 0 && i % y == 0){
                System.out.println("FizzBuzz");
            }

            else if(i % x == 0){
                System.out.println("Fizz");
            }
            
            else if(i % y == 0){
                System.out.println("Buzz");
            }

            else{
                System.out.println(i);
            }          
        }
    }
}
