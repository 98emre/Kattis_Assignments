
// https://open.kattis.com/problems/knightpacking

import java.util.Scanner;

public class Knightpacking {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        if(scanner.nextInt() % 2 == 0){
            System.out.println("second");
        }

        else{
            System.out.println("first");
        }
        
        scanner.close();
    }
}
