package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_2x2SquaresInMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        Integer rows = Integer.parseInt(input[0]);
        Integer cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        Integer counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = reader.readLine().split("\\s+");
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j].equals(matrix[i][j + 1]) &&
                        matrix[i][j].equals(matrix[i + 1][j]) &&
                        matrix[i][j].equals(matrix[i + 1][j + 1])) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
