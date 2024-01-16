
//https://open.kattis.com/problems/nastyhacks

import java.util.Scanner;

public class Nastyhacks {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCases = scanner.nextInt();
     

        for(int i = 0; i<numberOfCases; i++){
            int revenue = scanner.nextInt();
            int advertise = scanner.nextInt();
            int costOfAdvertise = scanner.nextInt();

            testCase(revenue, costOfAdvertise, advertise);
        }

        scanner.close();
    }

    private static void testCase(int revenue, int costOfAdvertise, int advertise){
        int sum =  advertise - costOfAdvertise - revenue;

        if(sum>0){
            System.out.println("advertise");
        }

        else if(sum == 0){
            System.out.println("does not matter");
        }

        else{
            System.out.println("do not advertise");
        }
    }
}
