
// https://open.kattis.com/problems/fifa

import java.util.Scanner;

public class Fifa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int improvementsSinceFrozen = scanner.nextInt(); 
        int improvementsPerYear = scanner.nextInt();

        int frozenYear = 2022;
        int currentYear = frozenYear + (improvementsSinceFrozen / improvementsPerYear);

        System.out.println(currentYear);
        scanner.close();

    }   
}
