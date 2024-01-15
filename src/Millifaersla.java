
// https://open.kattis.com/problems/millifaersla

import java.util.Scanner;

public class Millifaersla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstFee = scanner.nextInt();
        int secondFee = scanner.nextInt();
        int thirdFee = scanner.nextInt();

        if(firstFee < secondFee && firstFee < thirdFee){
            System.out.println("Monnei");
        }

        else if (secondFee < firstFee && secondFee < thirdFee){
            System.out.println("Fjee");
        }
        
        else{
            System.out.println("Dolladollabilljoll");
        }

    }
}
