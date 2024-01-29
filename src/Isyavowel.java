
// https://open.kattis.com/problems/isyavowel

import java.util.Scanner;

public class Isyavowel {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        int withOutY = 0;
        int withY = 0;

        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
                withOutY++;
                withY++;
            }

            if(input.charAt(i) == 'y'){
                withY++;
            }
        }

        System.out.println(withOutY + " " + withY);


        scanner.close();
    }
}
