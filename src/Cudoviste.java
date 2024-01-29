
// https://open.kattis.com/problems/cudoviste

import java.util.Scanner;

public class Cudoviste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.nextLine();

        String[] parking = new String[r];
        
        for(int i = 0; i<r; i++){
            parking[i] = scanner.nextLine();
        }

        int[] ans = new int[5];

        for(int i = 0; i<r-1; i++){
            for(int j = 0; j<c-1; j++){
                int[] count = new int[256];
                count['.'] = 0;
                count['X'] = 0;
                count['#'] = 0;

                count[parking[i].charAt(j)] +=1;
                count[parking[i+1].charAt(j)] +=1;
                count[parking[i].charAt(j+1)] +=1;
                count[parking[i+1].charAt(j+1)] +=1;

                if(count['.'] + count['X'] == 4){
                    ans[count['X']] +=1;
                }

            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(ans[i]);
        }
          
        scanner.close();
    }  
}
