
// https://open.kattis.com/problems/spritt

import java.util.Scanner;

public class Spritt {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfClassrooms = scanner.nextInt();
        int numberOfBottles = scanner.nextInt();

        int counterOfBottles = 0;

        for(int i = 0; i<numberOfClassrooms; i++){
            counterOfBottles += scanner.nextInt();
        }

        if(numberOfBottles>=counterOfBottles){
            System.out.println("Jebb");
        }

        else{
            System.out.println("Neibb");
        }

        scanner.close();
    }
    
}
