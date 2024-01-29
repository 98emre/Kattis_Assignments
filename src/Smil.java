
// https://open.kattis.com/problems/smil

import java.util.ArrayList;
import java.util.Scanner;

public class Smil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == ':' ||input.charAt(i) == ';'){
                if(i + 1 < input.length() && input.charAt(i+1) == ')'){
                    list.add(i);
                }

                if (i + 2 < input.length() && input.charAt(i + 1) == '-' && input.charAt(i + 2) == ')') {
                    list.add(i);
                }
            }
        }

        for (int index : list) {
            System.out.println(index);
        }

        scanner.close();
    }
}
