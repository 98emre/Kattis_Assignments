
// https://open.kattis.com/problems/undeadoralive

import java.util.Scanner;

public class Undeadoralive {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        boolean hasSmiley = text.contains(":)");
        boolean hasFrowny = text.contains(":(");
       
        if(hasSmiley && !hasFrowny){
            System.out.println("alive");
        }

        else if(!hasSmiley && hasFrowny){
            System.out.println("undead");
        }

        else if(hasSmiley && hasFrowny){
            System.out.println("double agent");
        }

        else{
            System.out.println("machine");
        }

        scanner.close();
    }
}
