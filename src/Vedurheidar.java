
// https://open.kattis.com/problems/vedurheidar

import java.util.Scanner;

public class Vedurheidar {

    public class Road {
        
        private String name;
        private int maxSpeed;

        public Road(String name, int maxSpeed){
            this.name = name;
            this.maxSpeed = maxSpeed;
        }
    }
    
    public static void main(String[] args) {

        Vedurheidar vedurheidar = new Vedurheidar();
        
        Scanner scanner = new Scanner(System.in);

        int currentWindSpeed = scanner.nextInt();
        int numberOfRoads = scanner.nextInt();

        Road[] roads = new Road[numberOfRoads];
        for(int i = 0; i<numberOfRoads; i++){
            String roadName = scanner.next();
            int maxSafeWindSpeed = scanner.nextInt();

            roads[i] = vedurheidar.new Road(roadName, maxSafeWindSpeed);
        }

        for(Road road: roads){
            System.out.println(road.name + (road.maxSpeed<currentWindSpeed ? " lokud" : " opin"));
        }

    }
}
