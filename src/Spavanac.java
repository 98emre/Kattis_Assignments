
// https://open.kattis.com/problems/spavanac

import java.util.Scanner;

public class Spavanac {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if(m>=45){
            System.out.println(h + " " + (m-45));
        }

        else {
        
            if(h==0){
                System.out.println(23 + " " + (60-(45-m)));
            }

           else{
                System.out.println(h-1 + " " + (60-(45-m)));
            }
        }

        scanner.close();
    }
}
