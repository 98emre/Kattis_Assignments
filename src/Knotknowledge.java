
// https://open.kattis.com/problems/knotknowledge

import java.util.Scanner;

public class Knotknowledge {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        
        int[] mustLearn = new int[number];
        int[] alreadyLearn = new int[number-1];

        for(int i = 0; i<mustLearn.length; i++){
            mustLearn[i] = scanner.nextInt();
        }

        for(int i = 0; i<alreadyLearn.length; i++){
            alreadyLearn[i] = scanner.nextInt();
        }

        int missingKnot = 0;

        for(int i = 0; i<mustLearn.length; i++){
            boolean found = false;

            for(int j = 0; j<alreadyLearn.length; j++){
                if(mustLearn[i] == alreadyLearn[j]){
                    found = true;
                    break;
                }
            }
            
            if(!found){
                missingKnot = mustLearn[i];
            }
        }

        System.out.println(missingKnot);
    }
}