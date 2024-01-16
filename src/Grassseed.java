
// https://open.kattis.com/problems/grassseed

import java.util.Scanner;

public class Grassseed {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double costPerSquareMeter = scanner.nextDouble();
        double numberOfLawn = scanner.nextDouble();
        
        double sumOfCost = 0.0;

        for(int i = 0; i<numberOfLawn; i++){
            double widthOfLawn = scanner.nextDouble();
            double lengthOfLawn = scanner.nextDouble();
            
            sumOfCost += (widthOfLawn * lengthOfLawn)*costPerSquareMeter;
        }

        scanner.close();
        System.out.println(sumOfCost);
    }
}
