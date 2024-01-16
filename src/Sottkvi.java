
// https://open.kattis.com/problems/sottkvi

import java.util.Scanner;

public class Sottkvi {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int d = scanner.nextInt();

        int counter = 0;

        for(int i = 0; i<n; i++){
            int x = scanner.nextInt();

            if(14 - ((d - x) + k) <=0){
                counter++;
            }
        }

        scanner.close();
        System.out.println(counter);
    }
}
