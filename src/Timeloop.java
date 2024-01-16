
// https://open.kattis.com/problems/timeloop

import java.util.Scanner;

public class Timeloop {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLoops = scanner.nextInt();

        for(int i = 1; i<=numberOfLoops; i++){
            System.out.println(i + " Abracadabra");
        }

        scanner.close();
    }
}
