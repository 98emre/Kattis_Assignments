
// https://open.kattis.com/problems/oddities

import java.util.Scanner;

public class Oddities {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numberOfTests = scanner.nextInt();
        int choosenNumber = 0;

        for(int i = 0; i<numberOfTests; i++){
            choosenNumber = scanner.nextInt();
            System.out.println(choosenNumber + " is "+ (choosenNumber % 2 == 0? "even": "odd"));
        }

        scanner.close();
    }
}
