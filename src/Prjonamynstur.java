
// https://open.kattis.com/problems/prjonamynstur

import java.util.Scanner;

public class Prjonamynstur {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRows = scanner.nextInt();
        int numberOfCharacters = scanner.nextInt();

        int counter = 0;

        for(int i = 0; i<numberOfRows; i++){
            String text = scanner.next();
            if(text.length()>numberOfCharacters){
                text.substring(0, 4);
            }

            for(int j = 0; j<text.length(); j++){
                counter += point(text.charAt(j));
            }
        }

        System.out.println(counter);
        scanner.close();
    }

    private static int point(char sign){
        if(sign == '.'){
            return 20;
        }

        else if(sign == 'O'){
            return 10;
        }

        else if(sign == 'A'){
            return 35;
        }

        else if(sign == '^'){
            return 5;
        }

        else if(sign == 'v'){
            return 22;
        }

        else{
            return 25;
        }
    }
}
