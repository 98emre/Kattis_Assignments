
// https://open.kattis.com/problems/hissingmicrophone

import java.util.Scanner;

public class Hissingmicrophone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[] array = text.toCharArray();

        boolean status = false;
        
        for(int i = 0; i<array.length-1; i++){
            if(array[i] == 's' && array[i+1] == 's'){
                status = true;
                break;
            }
        }

        if(status){
            System.out.println("hiss");
        }

        else{
            System.out.println("no hiss");
        }

        scanner.close();
    }
    
}
