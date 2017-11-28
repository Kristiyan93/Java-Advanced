package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_SequenceInMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        Integer rows = Integer.parseInt(input[0]);
        Integer cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = reader.readLine().split("\\s+");
        }

        int maxCount = 0;
        String maxString = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int down = 0;
                String temp2 = matrix[i][j] + ", ";

                for (int k = i; k < matrix.length - 1; k++) {
                    if (matrix[k][j].equals(matrix[k + 1][j])) {
                        down++;
                        temp2 += matrix[i][j] + ", ";
                    } else {
                        break;
                    }
                }

                if (down > maxCount) {
                    maxCount = down;
                    maxString = temp2;
                }

                int count3 = 0;
                String temp3 = matrix[i][j] + ", ";

                for (int k = i; k < Math.min(matrix.length - 1, matrix[i].length - 1); k++) {
                    if (matrix[k][k].equals(matrix[k + 1][k + 1])) {
                        count3++;
                        temp3 += matrix[k][k] + ", ";
                    } else {
                        break;
                    }
                }

                if (count3 > maxCount) {
                    maxCount = count3;
                    maxString = temp3;
                }
            }
        }

        if (maxString.equals("")) {
            maxString = matrix[0][0] + ",";
        }

        System.out.println(removeLastChar(maxString));
    }

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 2);
    }
}
