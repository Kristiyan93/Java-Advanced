package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C_DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            int[] elements = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::valueOf)
                    .toArray();

                    matrix[i] = elements;
        }

        Integer primaryDiagonal = 0;
        Integer secondaryDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j <= i; j++) {
                primaryDiagonal += matrix[i][j];
                secondaryDiagonal += matrix[i][matrix.length - j - 1];
            }
        }

        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }
}
