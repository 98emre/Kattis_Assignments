
// https://open.kattis.com/problems/meddelande

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int numberOfCharacter = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<row; i++){
            String text = scanner.next().substring(0, numberOfCharacter);
            char[] charcters = text.toCharArray();
            
            for(int j = 0; j<charcters.length; j++){
                if(charcters[j] != '.'){
                    sb.append(charcters[j]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
