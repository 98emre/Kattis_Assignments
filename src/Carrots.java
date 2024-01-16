
// https://open.kattis.com/problems/carrots

import java.util.Scanner;

public class Carrots {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        String[] words = new String[number1];

        for(int i = 0; i<words.length; i++){
            words[i] = scanner.nextLine();
        }

        scanner.close();
        System.out.print(number2);
    }
}
