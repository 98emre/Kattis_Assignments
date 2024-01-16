
// https://open.kattis.com/problems/reversebinary

import java.util.Scanner;

public class Reversebinary {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        while(true){

            if(number % 2 == 1){
                sb.append("1");
            }

            if(number % 2 == 0){
                sb.append("0");
            }

            number = (number / 2);

            if(number == 0){
                break;
            }
        }

        String newBinary = sb.reverse().toString();
        int sum = 0;

        for(int i = 0; i<newBinary.length(); i++){
            if(newBinary.charAt(i) == '1'){
                sum += Math.pow(2,i);
            }
        }

        scanner.close();
        System.out.println(sum);
    }
    
}
