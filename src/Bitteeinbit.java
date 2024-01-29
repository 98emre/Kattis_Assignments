
// https://open.kattis.com/problems/bitteeinbit

import java.util.Scanner;

public class Bitteeinbit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        if(n.contains("0")){
            System.out.println(0);
        }

        else{
            System.out.println(1);
        }

        scanner.close();
    }
}
