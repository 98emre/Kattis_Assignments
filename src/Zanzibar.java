
// https://open.kattis.com/problems/zanzibar

import java.util.Scanner;

public class Zanzibar {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 0; i<t; i++){

            int s = 0;

            int p = scanner.nextInt();

            while(true){
                int x = scanner.nextInt();

                if(x == 0){
                    break;
                }

                int d = x - 2 * p;

                if(d>0){
                    s +=d;
                }

                p = x;
            }

            System.out.println(s);
        }

        scanner.close();
    }
}
