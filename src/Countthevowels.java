

// https://open.kattis.com/problems/countthevowels

import java.util.Scanner;

public class Countthevowels {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int numberOfVowels = 0;

        for(char alphabet: word.toLowerCase().toCharArray()){
            if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
                numberOfVowels++;
            }   
        }

        System.out.println(numberOfVowels);
    }
}
