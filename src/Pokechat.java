

// https://open.kattis.com/problems/pokechat

import java.util.Scanner;

public class Pokechat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encodingString = scanner.nextLine();
        String pokemonIDs = scanner.nextLine();
        
        StringBuilder decoding = new StringBuilder();

        for(int i = 0; i<pokemonIDs.length(); i+=3){
            String pokemonId = pokemonIDs.substring(i, i+3);
            int index = Integer.parseInt(pokemonId)-1;

            decoding.append(encodingString.charAt(index));
        }

        System.out.println(decoding.toString());
        scanner.close();
    }
}
