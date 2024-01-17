
// https://open.kattis.com/problems/eyeofsauron

import java.util.Scanner;

public class Eyeofsauron {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        boolean check = true;

        scanner.close();

       if(n.charAt((n.length()/2)-1) != '(' || n.length() % 2 != 0){
            check = false;
        }

        if(n.charAt((n.length()/2)) != ')' || n.length() % 2 != 0){
            check = false;
        }


        if(check){
            System.out.println("correct");
        }

        else{
            System.out.println("fix");
        }

        
    }
}
