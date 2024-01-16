
// https://open.kattis.com/problems/hradgreining

import java.util.Scanner;

public class Hradgreining {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        scanner.close();

        if(text.contains("COV")){
            System.out.println("Veikur!");
        } 

        else{
            System.out.println("Ekki veikur!");
        }
    }
    
}
