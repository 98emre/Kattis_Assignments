
// https://open.kattis.com/problems/vidsnuningur

import java.util.Scanner;

public class Vidsnuningur {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = new StringBuilder(scanner.nextLine()).reverse().toString();

        scanner.close();
        System.out.println(text);
    }
}
