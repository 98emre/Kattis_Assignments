
// https://open.kattis.com/problems/asciikassi

import java.util.Scanner;

public class Asciikassi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sideLength = scanner.nextInt();

        if (sideLength >= 0 && sideLength <= 3) {
            System.out.print(printSmallGroup(sideLength));
        } 
        
        else {

            StringBuilder sb = new StringBuilder();

            // Top
            sb.append("+-");
            for (int i = 0; i < sideLength - 1; i++) {
                sb.append("-");
            }
            sb.append("+\n");

            // Middle
            for (int i = 0; i < sideLength; i++) {
                sb.append("|");

                for (int j = 0; j < sideLength; j++) {
                    sb.append(" ");
                }
                
                sb.append("|\n");
            }

            // Bottom
            sb.append("+-");
            for (int i = 0; i < sideLength - 1; i++) {
                sb.append("-");
            }
            sb.append("+\n");

            System.out.print(sb);
        }

        scanner.close();
    }

    private static String printSmallGroup(int n) {
        StringBuilder sb = new StringBuilder();

        if (n == 0) {
            sb.append("++\n");
            sb.append("++\n");
        } else if (n == 1) {
            sb.append("+-+\n");
            sb.append("| |\n");
            sb.append("+-+\n");
        } else if (n == 2) {
            sb.append("+--+\n");
            sb.append("|  |\n");
            sb.append("|  |\n");
            sb.append("+--+\n");
        } else {
            sb.append("+---+\n");
            sb.append("|   |\n");
            sb.append("|   |\n");
            sb.append("|   |\n");
            sb.append("+---+\n");
        }

        return sb.toString();
    }
}
