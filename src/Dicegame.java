
// https://open.kattis.com/problems/dicegame

import java.util.Scanner;

public class Dicegame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        for(int i = 0; i<4; i++){
            a+= scanner.nextInt();
        }   

        for(int j = 0; j<4; j++){
            b += scanner.nextInt();
        }

        if(a == b){
            System.out.println("Tie");
        }

        else if(b>a){
            System.out.println("Emma");
        }

        else{
            System.out.println("Gunnar");
        }
        
        scanner.close();
    }
}
