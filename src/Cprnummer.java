
// https://open.kattis.com/problems/cprnummer

import java.util.Arrays;
import java.util.Scanner;

public class Cprnummer {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cpr = scanner.nextLine();
        scanner.close();

        char[] characters = cpr.toCharArray();

        int sum = 0;

        for(int i = 0; i<characters.length; i++){
            if(i==0 || i == 7){
                sum += Integer.parseInt(String.valueOf(characters[i]))*4;
            }

            else if(i == 1 || i == 8){
                sum += Integer.parseInt(String.valueOf(characters[i]))*3;
            }

            else if(i == 2 || i == 9){
                sum += Integer.parseInt(String.valueOf(characters[i]))*2;
            }

            else if(i == 3){
                sum += Integer.parseInt(String.valueOf(characters[i]))*7;
            }

            else if(i == 4){
                sum += Integer.parseInt(String.valueOf(characters[i]))*6;
            }

            else if(i == 5){
                sum += Integer.parseInt(String.valueOf(characters[i]))*5;
            }

            else if(i == 10){
                sum += Integer.parseInt(String.valueOf(characters[i]))*1;
            }
        }

        if(sum % 11 == 0){
            System.out.println(1);
        } 

        else{
            System.out.println(0);
        }
    }
}
