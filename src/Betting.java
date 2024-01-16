

// https://open.kattis.com/problems/betting

import java.util.Scanner;

public class Betting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int procentOptionOne = scanner.nextInt();

        double optionOne = 100.0 / procentOptionOne;

        double optionTwo = 100.0 / (100.0-procentOptionOne);

        scanner.close();

        System.out.println(optionOne);
        System.out.println(optionTwo);
        
    }
    
}
