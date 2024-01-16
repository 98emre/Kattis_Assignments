
//https://open.kattis.com/problems/twostones

import java.util.Scanner;

public class Twostones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        if(number % 2 == 0){
            System.out.println("Bob");
        }

        else{
            System.out.println("Alice");
        }

        scanner.close();
    }
}
