
// https://open.kattis.com/problems/zamka

import java.util.Scanner;

public class Zamka {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        scanner.close();
        System.out.println(findSmallestValue(a, c));
        System.out.println(findLargestValue(b, c));
    }
    
    private static int findLargestValue(int b, int c) {
        int result = b;
        int dummy = result;
        int sum = 0;

        while (true) {
            if (sum == c && dummy == 0) {
                break;
            }

            if (dummy == 0) {
                result--;
                dummy = result;
                sum = 0;
            }

            
            sum += dummy % 10;
            dummy /= 10;
        }

        return result;
    }
    
    private static int findSmallestValue(int a, int c){

        int result = a;
        int dummy = result;
        int sum = 0;

        if(result == c){
           return result;  
        }

        while(true){
            if(sum == c){
                break;
            }

            if(dummy == 0){
                result++;
                dummy = result;
                sum = 0;
            }

            sum += dummy % 10;            
            dummy /= 10;
        }

        return result;
    }
}
