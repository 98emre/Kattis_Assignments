
// https://open.kattis.com/problems/addingtrouble

import java.util.Scanner;

public class Addingtrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a+b == c){
            System.out.println("correct!");
        }

        else{
            System.out.println("wrong!");
        }

        scanner.close();
    }
}
