package com.genus;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrixer {

    public static String[][] inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("Line #"+(i+1)+": ");
                matrix[i][j] = scanner.nextLine().toUpperCase().trim();
            }
        }
        return matrix;
    }

    public static void printMatrix(String[][] matrix) {
        System.out.println();
        for (int m = 0; m < matrix.length; m++) {
            String[] row = matrix[m];
            for (int n = 0; n < row.length; n++) {
                String col = row[n];
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
