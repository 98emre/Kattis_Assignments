

// https://open.kattis.com/problems/fyi

import java.util.Scanner;

public class Fyi {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<3; i++){
            sb.append(numbers.charAt(i));
        }        

        if(sb.toString().equals(new String("555"))){
            System.out.println("1");
        }

        else{
            System.out.println("0");
        }

        scanner.close();
    }
}
