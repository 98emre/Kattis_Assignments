
// https://open.kattis.com/problems/qaly

import java.util.Scanner;

public class Qaly {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qualityOfLife = scanner.nextInt();
        double sum = 0;

        for(int i = 0; i<qualityOfLife; i++){
            double period = scanner.nextDouble();
            double years = scanner.nextDouble();

            sum += period * years;
        }

        System.out.println(sum);
    }
}
