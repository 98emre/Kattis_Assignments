
// https://open.kattis.com/problems/oddmanout

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Oddmanout {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i<n; i++){
            Set<Integer> s = new HashSet<>();
            int g = scanner.nextInt();

            for(int j = 0; j<g; j++){
                int x = scanner.nextInt();
                if (s.contains(x)) {
                    s.remove(x);
                } else {
                    s.add(x);
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + s.iterator().next());
        }

        scanner.close();
    }
}
