
// https://open.kattis.com/problems/echoechoecho

import java.util.Scanner;

public class Echo {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<3; i++){
            sb.append(word + " ");
        }

        scanner.close();
        System.out.println(sb.toString());
    }
}

