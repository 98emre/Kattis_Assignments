
// https://open.kattis.com/problems/greetings2

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String numberOfWords = word.substring(1,word.length()-1);

        StringBuilder sb = new StringBuilder();


        sb.append(word.substring(0,1));

        for(int i = 0; i<numberOfWords.length()*2; i++){
            sb.append("e");
        }

        sb.append(word.substring(word.length()-1));

        scanner.close();
        System.out.println(sb.toString());
    }
    
}
