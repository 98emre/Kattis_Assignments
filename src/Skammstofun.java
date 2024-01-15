
// https://open.kattis.com/problems/skammstofun

import java.util.ArrayList;
import java.util.Scanner;

public class Skammstofun {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numberOfWords = scanner.nextInt();

        ArrayList<String> listOfWords = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < numberOfWords; i++) {
            listOfWords.add(scanner.next());
        }

        for (String word : listOfWords) {
            if(Character.isUpperCase(word.charAt(0))){
                sb.append(word.charAt(0));
            }
        }

        System.out.println(sb.toString());
        scanner.close();
    }
}
