
// https://open.kattis.com/problems/dicecup

import java.util.Scanner;

public class Dicecup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();

        int[] sumOccurrences = new int[dice1 + dice2 + 1];

        for (int i = 1; i <= dice1; i++) {
            for (int j = 1; j <= dice2; j++) {
                int currentSum = i + j;
                sumOccurrences[currentSum]++;
            }
        }

        printPropabilities(sumOccurrences, 0);
     
    }    

    private static void printPropabilities(int[] sumOccurrences, int maxOccurrences){
   
        for (int sum = 2; sum < sumOccurrences.length; sum++) {
            if (sumOccurrences[sum] > maxOccurrences) {
                maxOccurrences = sumOccurrences[sum];
            }
        }

        for (int sum = 2; sum < sumOccurrences.length; sum++) {
            if (sumOccurrences[sum] == maxOccurrences) {
                System.out.println(sum);
            }
        }
    }
}
