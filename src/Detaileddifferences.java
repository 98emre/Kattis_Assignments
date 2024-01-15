
// https://open.kattis.com/problems/detaileddifferences

import java.util.Scanner;

public class Detaileddifferences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTestCase = scanner.nextInt();

        for(int i = 0; i<numberOfTestCase; i++){
            String text = scanner.next();
            String text2 = scanner.next();
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j<text.length(); j++){
                sb.append(text.charAt(j) == text2.charAt(j) ? "." : "*");
            }
            
            System.out.println(text);
            System.out.println(text2);
            System.out.println(sb.toString());
        }

    }    
}
