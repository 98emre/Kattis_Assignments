
// https://open.kattis.com/problems/autori

import java.util.Scanner;

public class Autori {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] word = scanner.nextLine().split("-");
        StringBuilder sb = new StringBuilder();

        for(String alphabet: word){
            if(!alphabet.isEmpty()){
                sb.append(alphabet.charAt(0));
            }
        }
        scanner.close();
        System.out.println(sb.toString());

    }
}
