
// https://open.kattis.com/problems/batterup

import java.util.Scanner;

public class Batterup {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBats = scanner.nextInt();

        int loop = numberOfBats;
        double result = 0.0; 

        while(0<loop){

            int input = scanner.nextInt();

            if(input>=0){
                result += input;
            }

            if(input<0){
                numberOfBats--;
            }

            loop--;
        }

        result = result / numberOfBats;
        System.out.println(result);
    }
}
