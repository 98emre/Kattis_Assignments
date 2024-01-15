
// https://open.kattis.com/problems/cutthenegativity

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Flight {
    int from;
    int to;
    int cost;

    public Flight(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}

public class Cutthenegativity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of cities
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input: Direct flight costs table
        int[][] costs = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                costs[i][j] = scanner.nextInt();
            }
        }

        // Create a list to store direct flights
        ArrayList<Flight> directFlights = new ArrayList<>();

        // Extract direct flights from the costs table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (costs[i][j] != -1) {
                    directFlights.add(new Flight(i + 1, j + 1, costs[i][j]));
                }
            }
        }

        // Sort the direct flights
        Collections.sort(directFlights, Comparator.comparingInt((Flight f) -> f.from).thenComparingInt(f -> f.to));

        // Output: Number of direct flights
        System.out.println(directFlights.size());

        // Output: List of direct flights
        for (Flight flight : directFlights) {
            System.out.println(flight.from + " " + flight.to + " " + flight.cost);
        }

        scanner.close();
    }
}
