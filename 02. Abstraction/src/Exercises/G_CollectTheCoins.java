package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_CollectTheCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[][] matrix = new char[4][];

        for (int i = 0; i < 4; i++) {
            char[] currentRow = reader.readLine().toCharArray();
            matrix[i] = new char[currentRow.length];

            System.arraycopy(currentRow, 0, matrix[i], 0, currentRow.length);
        }

        char[] moves = reader.readLine().toCharArray();
        int currentRow = 0;
        int currentCol = 0;

        int coins = 0;
        int wallsHit = 0;
        if (matrix[currentRow][currentCol] == '$')
            coins++;

        for (char move : moves) {
            int copyRow = currentRow;
            int copyCol = currentCol;

            switch (move) {
                case '^':
                    currentRow--;
                    break;
                case '>':
                    currentCol++;
                    break;
                case 'V':
                    currentRow++;
                    break;
                case '<':
                    currentCol--;
                    break;
            }

            if (!isInMatrix(currentRow, currentCol, matrix)) {
                currentRow = copyRow;
                currentCol = copyCol;
                wallsHit++;
            } else {
                if (matrix[currentRow][currentCol] == '$')
                    coins++;
            }
        }

        System.out.println("Coins = " + coins);
        System.out.println("Walls = " + wallsHit);
    }

    private static boolean isInMatrix(int currentRow, int currentCol, char[][] matrix) {
        return currentRow >= 0 && currentCol >= 0 && currentRow < 4 && currentCol < matrix[currentRow].length;
    }
}