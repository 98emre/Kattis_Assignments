
// https://open.kattis.com/problems/whichisgreater

import java.util.Scanner;

public class Whichisgreater {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b){
            System.out.println("1");
        }

        else{
            System.out.println("0");
        }

        scanner.close();
    }
}
