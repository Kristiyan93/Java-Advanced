package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_MatrixOfPalindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        Integer rows = Integer.parseInt(input[0]);
        Integer cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        Character strartingCHar = 'a';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = strartingCHar + "" + (char)(strartingCHar + j) + "" + strartingCHar;
            }

            strartingCHar++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
