
// https://open.kattis.com/problems/conundrum

import java.util.Scanner;

public class Conundrum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] cipherText = input.toCharArray();
        char[] targetText = {'P','E','R'};

        int days = countDays(cipherText, targetText);

        System.out.println(days);
        scanner.close();
    }

    private static int countDays(char[] cipherText, char[] targetText){
        int count = 0;

        for(int i = 0; i<cipherText.length; i++){
           if(cipherText[i] != targetText[i % targetText.length]){
                count++;
           }
        }

        return count;
    }
}
