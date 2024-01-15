
// https://open.kattis.com/problems/kikiboba

import java.util.Scanner;

public class Kikiboba {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int checkB = 0;
        int checkK = 0;

        for(int i = 0; i<text.length(); i++){
            Character tmp = text.charAt(i);

            if(tmp == 'b'){
                checkB++;
            }

            else if(tmp == 'k'){
                checkK++;
            }
        }
        
        if(checkB > checkK){
            System.out.println("boba");
        }

        else if(checkK > checkB){
            System.out.println("kiki");
        }

        else if(checkB == checkK && checkK > 0 && checkB > 0){
            System.out.println("boki");
        }

        else{
            System.out.println("none");
        }
    }
}
