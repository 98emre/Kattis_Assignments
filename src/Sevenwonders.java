
// https://open.kattis.com/problems/sevenwonders

import java.util.Scanner;

public class Sevenwonders {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toUpperCase();

        int tablet = 0;
        int compass = 0;
        int gear = 0;

        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == 'T'){
                tablet++;
            }

            if(input.charAt(i) == 'C'){
                compass++;
            }

            if(input.charAt(i) == 'G'){
                gear++;
            }
        }

        double sum = Math.pow(tablet,2) + Math.pow(compass,2) + Math.pow(gear,2);

        int setBonus = Math.min(tablet, Math.min(compass, gear));

        sum += setBonus*7;
    
        System.out.println((int)sum);
        scanner.close();
    }
}
