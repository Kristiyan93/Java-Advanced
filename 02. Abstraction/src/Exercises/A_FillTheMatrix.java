package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_FillTheMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(",\\s+");

        Integer rows = Integer.parseInt(input[0]);
        String type = input[1];

        Integer[][] matrix = new Integer[rows][];

        if (type.equals("A")) {
            matrix = calcilateTypeA(rows);
        }

        if (type.equals("B")) {
            matrix = calcilateTypeB(rows);
        }

        getPrintMatrix(matrix, rows);
    }

    private static void getPrintMatrix(Integer[][] matrix, Integer rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static Integer[][] calcilateTypeB(Integer n) {
        Integer[][] matrix = new Integer[n][n];
        Integer counter = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = counter++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[j][i] = counter;
                    counter++;
                }
            }
        }

        return matrix;
    }

    private static Integer[][] calcilateTypeA(Integer rows) {
        Integer[][] matrix = new Integer[rows][rows];
        Integer counter = 1;

        for (int row = 0; row < rows; row++) {
            for (int colum = 0; colum < rows; colum++) {
                matrix[colum][row] = counter++;
            }
        }

        return matrix;
    }
}
