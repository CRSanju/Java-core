package random;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // dimensions: depth (n), rows (p), columns (g)
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int g = scanner.nextInt();

        int[][][] a = new int[n][p][g];

        // read values
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = scanner.nextInt();
                }
            }
        }

        // print 3D array in layers
        System.out.println("3D Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        // calculate and print average of each 3D column (same row & column across all layers)
        for (int j = 0; j < p; j++) {
            for (int k = 0; k < g; k++) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i][j][k];
                }
                double avg = (double) sum / n;
                System.out.println("Average of column (" + j + "," + k + "): " + avg);
            }
        }

        scanner.close();
    }
}
