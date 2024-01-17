
// https://open.kattis.com/problems/weakvertices

import java.util.ArrayList;
import java.util.Scanner;

public class Weakvertices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> results = new ArrayList<>();

        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }

            int[][] mat = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = scanner.nextInt();
                }
            }

            if (n < 3) {
                // Too few vertices to form a triangle
                StringBuilder vertices = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    vertices.append(i).append(" ");
                }
                results.add(vertices.toString().trim());
            } else {
                results.add(findWeakVertices(mat, n));
            }
        }

        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }

    private static String findWeakVertices(int[][] mat, int n) {
        ArrayList<Integer> weakVertices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // There are less than 2 connected vertices or,
            // the connected vertices do not form a triangle
            if (countOnes(mat[i]) < 2 || noTriangle(mat[i], mat)) {
                weakVertices.add(i);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int vertex : weakVertices) {
            result.append(vertex).append(" ");
        }

        return result.toString().trim();
    }

    private static boolean noTriangle(int[] row, int[][] mat) {
        ArrayList<Integer> edgeIndices = new ArrayList<>();

        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                edgeIndices.add(i);
            }
        }

        // Check that at least 2 vertices are connected to each other
        for (int i : edgeIndices) {
            for (int j : edgeIndices) {
                if (mat[i][j] == 1) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int countOnes(int[] row) {
        int count = 0;
        for (int value : row) {
            if (value == 1) {
                count++;
            }
        }
        return count;
    }
}
