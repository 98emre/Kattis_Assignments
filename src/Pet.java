
// https://open.kattis.com/problems/pet

import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int rows = 5;
        int columns = 4;

        int[][] numberOfContestans = new int[rows][columns]; 

        int[] counter = new int[5];

        for(int i = 0; i<rows; i++){
            int sum = 0;
            for(int j = 0; j<columns; j++){
                numberOfContestans[i][j] = scanner.nextInt();
                sum += numberOfContestans[i][j];
                counter[i] = sum;
            }
        }

        int index = 0;
        int largestNumber = 0;

        for(int i = 0; i<counter.length; i++){
            if(largestNumber<counter[i]){
                largestNumber = counter[i];
                index = i+1;
            }
        }

        scanner.close();
        System.out.println(index +" "+ largestNumber);
    }
}
