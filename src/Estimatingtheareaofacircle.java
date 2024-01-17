
// https://open.kattis.com/problems/estimatingtheareaofacircle

import java.util.Scanner;

public class Estimatingtheareaofacircle {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            double r = scanner.nextDouble();
            int m = scanner.nextInt();
            int c = scanner.nextInt();

            if(r == 0 && m == 0 && c == 0){
                break;
            }

            double trueArea = Math.PI * r * r;
            double estimatedArea = ((double) c / m) * (2*r) * (2*r);

            System.out.printf("%.10f %.10f%n", trueArea, estimatedArea);

            scanner.nextLine();
        }

        scanner.close();
    }
}
