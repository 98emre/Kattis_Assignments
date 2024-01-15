
// https://open.kattis.com/problems/vedurvindhradi

import java.util.Scanner;

public class Vedurvindhradi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getWindLevel(scanner.nextDouble()));

    }

    private static String getWindLevel(double windSpeed) {
        if (windSpeed >= 0.0 && windSpeed <= 0.2) {
            return "Logn";
        } else if (windSpeed >= 0.3 && windSpeed <= 1.5) {
            return "Andvari";
        } else if (windSpeed >= 1.6 && windSpeed <= 3.3) {
            return "Kul";
        } else if (windSpeed >= 3.4 && windSpeed <= 5.4) {
            return "Gola";
        } else if (windSpeed >= 5.5 && windSpeed <= 7.9) {
            return "Stinningsgola";
        } else if (windSpeed >= 8.0 && windSpeed <= 10.7) {
            return "Kaldi";
        } else if (windSpeed >= 10.8 &&windSpeed <= 13.8) {
            return "Stinningskaldi";
        } else if (windSpeed >= 13.9 && windSpeed <= 17.1) {
            return "Allhvass vindur";
        } else if (windSpeed >= 17.2 && windSpeed <= 20.7) {
            return "Hvassvidri";
        } else if (windSpeed >= 20.8 && windSpeed <= 24.4) {
            return "Stormur";
        } else if (windSpeed >= 24.5 && windSpeed <= 28.4) {
            return "Rok";
        } else if (windSpeed >= 28.5 && windSpeed <= 32.6) {
            return "Ofsavedur";
        } else {
            return "Farvidri";
        } 
    }
}
