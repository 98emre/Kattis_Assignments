
// https://open.kattis.com/problems/classfieldtrip

import java.util.Arrays;
import java.util.Scanner;

public class Classfieldtrip {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        String text2 = scanner.next();
        
        String merged = text+text2;
        char[] charArray = merged.toCharArray();
        Arrays.sort(charArray);
      
        String newText = new String(charArray);

        System.out.println(newText);
    }
}
