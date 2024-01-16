
// https://open.kattis.com/problems/tarifa

import java.util.Scanner;

public class Tarifa {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMegaBytes = scanner.nextInt();
        int numberOfMonths = scanner.nextInt();

        int sum = numberOfMegaBytes;

        for(int i = 0; i<numberOfMonths; i++){
            sum -= scanner.nextInt();
            sum += numberOfMegaBytes;
        }

        scanner.close();
        System.out.println(sum);
    }
}
