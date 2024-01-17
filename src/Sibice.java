
//https://open.kattis.com/problems/sibice

import java.util.Scanner;

public class Sibice {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        double twoDimensionell = Math.sqrt(w*w+h*h);

        for(int i = 0; i<n; i++){
            int number = scanner.nextInt();

            if(number<=twoDimensionell){
                System.out.println("DA");
            }

            else{
                System.out.println("NE");
            }
        }

        scanner.close();
    }
}
