
// https://open.kattis.com/problems/shandy

import java.util.Scanner;

public class Shandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beer = scanner.nextInt();
        int lemon = scanner.nextInt();

        if(lemon == 0 || beer == 0){
            System.out.println(0);
        }

        else{
            if(beer > lemon){
                System.out.println((lemon*2));
            }

            else if(lemon > beer){
                System.out.println((beer*2));
            }
    
            else{
                System.out.println((lemon*2));
            }
        }

        scanner.close();
    }   
}
