
// https://open.kattis.com/problems/reduplikation

import java.util.Scanner;

public class Reduplication {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int number = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<number; i++){
            sb.append(word);
        }

        scanner.close();
        System.out.println(sb.toString());
    }
}
