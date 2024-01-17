
// https://open.kattis.com/problems/modulo

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Modulo {   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> uniqeValues = new HashSet<>();
        
        for(int i = 0; i<10;i++){
            int number = scanner.nextInt();
            uniqeValues.add(number % 42);
        }

        scanner.close();
        System.out.println(uniqeValues.size());
    }
}
