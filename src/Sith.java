
// https://open.kattis.com/problems/sith

import java.util.Scanner;

public class Sith {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String forceUser = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = scanner.nextInt();

        String force = "VEIT EKKI";

       if (a-b <0) {
            if(result == Math.abs(a-b)){
                force = "SITH";
            }
            else{
                force = "JEDI";
            }
       }

       System.out.println(force);
    }
}
