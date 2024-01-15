
//https://open.kattis.com/problems/cold

import java.util.Scanner;

public class Cold {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int tempList[] = new int[days];

        for(int i = 0; i<days; i++){
            tempList[i] = scanner.nextInt();
        }

        int tempLessThanZero = 0;

        for(int i = 0; i<days; i++){
            if(tempList[i]<0){
                tempLessThanZero++;
            }
        }
        
        System.out.println(tempLessThanZero);
    }
    
}
