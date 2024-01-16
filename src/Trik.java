
// https://open.kattis.com/problems/trik

import java.util.Scanner;

public class Trik {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toUpperCase();

        boolean[] cups = {true, false,false};

        for(char move: text.toCharArray()){
            if(move == 'A'){
                swamp(cups, 0, 1);
            } 
            
            else if(move == 'B'){
                swamp(cups, 1, 2);
            }

            else if(move == 'C'){
                swamp(cups, 0, 2);
            }
        }

        for(int i = 0; i<cups.length; i++){
            if(cups[i]){
                System.out.println(i+1);
                break;
            }
        }

        scanner.close();
    }

    private static void swamp(boolean [] cups, int i, int j){
        boolean temp = cups[i];
        cups[i] = cups[j];
        cups[j] = temp;
    }
    
}
