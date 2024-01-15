
// https://open.kattis.com/problems/oddecho

import java.util.ArrayList;
import java.util.Scanner;

public class OddEcho {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        int numberOfWords = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> listOfWords = new ArrayList<>();

        for(int i = 0; i<numberOfWords; i++){
            listOfWords.add(scanner.nextLine());
        }
        
        for(int i = 0; i<listOfWords.size(); i++){
            if(i % 2 == 0){
                sb.append(listOfWords.get(i) + " ");
            }
        } 
            
        System.out.println(sb.toString());


    }
}
