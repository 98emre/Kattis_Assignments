
// https://open.kattis.com/problems/ekkidaudi

import java.util.Scanner;

public class Ekkidaudi {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstText = scanner.nextLine().split("\\|");
        String[] secondText = scanner.nextLine().split("\\|");

        String text1 = firstText[0]+secondText[0];
        String text2 = firstText[1]+secondText[1];

        System.out.println(text1 + " " + text2);
    }
}
