
// https://open.kattis.com/problems/aleidibio

import java.util.Scanner;

public class Aleidibio {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hannesToArnar = scanner.nextInt();
        int arnarToCinema = scanner.nextInt();
        int filmStartTime = scanner.nextInt();

        int latestStartTime = filmStartTime - arnarToCinema - hannesToArnar;

        System.out.println(latestStartTime);

        scanner.close();
    }
    
}
