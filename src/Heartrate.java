
// https://open.kattis.com/problems/heartrate

import java.util.Scanner;

public class Heartrate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCases = scanner.nextInt();
    
        for(int i = 0; i<numberOfCases; i++){
            int b = scanner.nextInt();
            double p = scanner.nextDouble();

            if(p<0 || p>1000 || b<2 || b>1000){
                throw new IllegalArgumentException("Not right value");
            }

            double bmp = (60*b) / p;
            double abpm = (60/p);
            
            String result = String.format("%.4f %.4f %.4f", (bmp - abpm), bmp, (bmp + abpm));
            
            System.out.println(result);
        }

        scanner.close();
    }    
}
