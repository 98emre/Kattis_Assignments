
// https://open.kattis.com/problems/isithalloween

import java.util.Scanner;

public class Isithalloween {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.next();
        int day = scanner.nextInt();

        scanner.close();

        if(month.toUpperCase().equals("DEC")){
            if(day == 25){
                System.out.println("yup");
            }

            else{
                System.out.println("nope");
            }
        }

        else if( month.toUpperCase().equals("OCT")){
            if(day == 31){
                System.out.println("yup");
            }

            else{
                System.out.println("nope");
            }
        }

        else{
            System.out.println("nope");
        }


    }
    
}
