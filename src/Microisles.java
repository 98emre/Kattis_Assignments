import java.util.*;

class Island {
    double x, y;

    public Island(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Microisles {
    static double distance(Island a, Island b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    static double minCostConnectAllIslands(int n, Island[] islands) {
        boolean[] visited = new boolean[n];
        visited[0] = true;
        double totalCost = 0;

        for (int i = 0; i < n - 1; i++) {
            double minDistance = Double.MAX_VALUE;
            int closestIsland = -1;

            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    for (int k = 0; k < n; k++) {
                        if (visited[k]) {
                            double dist = distance(islands[k], islands[j]);
                            if (dist < minDistance) {
                                minDistance = dist;
                                closestIsland = j;
                            }
                        }
                    }
                }
            }

            visited[closestIsland] = true;
            totalCost += minDistance;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Island[] islands = new Island[n];
            for (int i = 0; i < n; i++) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                islands[i] = new Island(x, y);
            }
            double result = minCostConnectAllIslands(n, islands);
            System.out.printf("%.2f\n", result);
        }
        scanner.close();
    }
}
