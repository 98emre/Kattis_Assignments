
// https://open.kattis.com/problems/magictrick

import java.util.Scanner;

public class Magictrick {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String card = scanner.nextLine();

        char[] characters = card.toCharArray();
        int[] counters = new int[26];

        int result = 1;

        for(int i = 0; i<characters.length; i++){
                int index = characters[i] - 'a';
                counters[index]++;
        }

        for(int j = 0; j<counters.length; j++){
            if(counters[j] >= 2){
                result = 0;
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
