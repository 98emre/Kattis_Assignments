
// https://open.kattis.com/problems/everywhere

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Everywhere {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTest = scanner.nextInt();

        for(int i  = 0; i<numberOfTest; i++){
            Set<String> uniqueCities = new HashSet<>();
            int cities = scanner.nextInt();
            
            for(int j = 0; j<cities; j++){
                uniqueCities.add(scanner.next());
            }

            System.out.println(uniqueCities.size());
        }
    }
}
