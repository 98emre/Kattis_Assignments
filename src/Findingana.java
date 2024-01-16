

// https://open.kattis.com/problems/findingana

import java.util.Scanner;

public class Findingana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A'){
                word = word.substring(i);
                break;
            }
        }

        scanner.close();
        System.out.println(word);
    }
}
