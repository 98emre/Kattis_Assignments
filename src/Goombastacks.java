
// https://open.kattis.com/problems/goombastacks

import java.util.Scanner;

public class Goombastacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int goombas = 0; 
        boolean impossible = false; 

        for (int i = 0; i < n; i++) {
            int gi = scanner.nextInt(); 
            int bi = scanner.nextInt(); 

            goombas += gi;

            if(goombas < bi){

                if(goombas>0){
                    impossible = true;
                    break;
                }

                else{
                    goombas = bi;
                }
            }
            
        }

        System.out.println(impossible ? "impossible" : "possible");
        scanner.close();
    }
}


/*
 
// https://open.kattis.com/problems/goombastacks

import java.util.Scanner;

public class Goombastacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int goombas = 0; 
        boolean impossible = false; 

        for (int i = 0; i < n; i++) {
            int gi = scanner.nextInt(); 
            int bi = scanner.nextInt(); 
            
            goombas += gi; 

            if (goombas < bi) {
                if (goombas > 0) {
                    impossible = true; 
                    break; 
                } 
                
                else {
                    goombas = bi; 
                }
            }
        }

        System.out.println(impossible ? "impossible" : "possible");
        scanner.close();
    }
}
 */