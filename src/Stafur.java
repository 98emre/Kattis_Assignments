
// https://open.kattis.com/problems/stafur

import java.util.*;

public class Stafur {

    private static final String VOWELS = "AEIOU";
    private static final String CONSONANTS = "BCDFGHJKLMNPQRSTVWXZ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.next().trim().toUpperCase();

        if(VOWELS.contains(letter)){
            System.out.println("Jebb");
        }

        else if(CONSONANTS.contains(letter)){
            System.out.println("Neibb");
        }

        else{
            System.out.println("Kannski");
        }   

        scanner.close();
    }
}
