
// https://open.kattis.com/problems/umferd

import java.util.Scanner;

public class Umferd {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numberOfCells = scanner.nextInt();
        int numberOfLanes = scanner.nextInt();
        
        int numberOfEmptyCells = 0;

        for(int i = 0; i<numberOfLanes; i++){
            String input = scanner.next();

            for(int j = 0; j<numberOfCells; j++){
                if(input.charAt(j) == '.'){
                    numberOfEmptyCells++;
                }
            }
        }

        double result =  (double) numberOfEmptyCells/ (numberOfCells * numberOfLanes);
        
        System.out.printf("%.5f\n", result);

        scanner.close();

    }
    
}
