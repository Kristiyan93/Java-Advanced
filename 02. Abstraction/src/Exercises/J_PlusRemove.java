package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class J_PlusRemove {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<char[]> originalMatrix = new ArrayList<>();
        List<char[]> copyMatrix = new ArrayList<>();

        while (true) {
            String input = reader.readLine();

            if (input.equals("END")) {
                break;
            }

            originalMatrix.add(input.toCharArray());
            copyMatrix.add(input.toUpperCase().toCharArray());
        }

        ManupulateMatrix(originalMatrix, copyMatrix);
        printmMatrix(originalMatrix);
    }

    private static void printmMatrix(List<char[]> originalMatrix) {
        for (char[] anOriginalMatrix : originalMatrix) {
            System.out.println(String.valueOf(anOriginalMatrix).replace("\0",""));
        }
    }

    private static void ManupulateMatrix(List<char[]> originalMatrix, List<char[]> copyMatrix) {
        for (int i = 0; i < originalMatrix.size() - 2; i++) {
            for (int j = 0; j < originalMatrix.get(i).length; j++) {
                try {
                    char a = copyMatrix.get(i)[j];
                    char b = copyMatrix.get(i + 1)[j - 1];
                    char c = copyMatrix.get(i + 1)[j];
                    char d = copyMatrix.get(i + 1)[j + 1];
                    char e = copyMatrix.get(i + 2)[j];

                    if (a == b && b == c && c == d && d == e) {
                        originalMatrix.get(i)[j] = '\0';
                        originalMatrix.get(i + 1)[j - 1] = '\0';
                        originalMatrix.get(i + 1)[j] = '\0';
                        originalMatrix.get(i + 1)[j + 1] = '\0';
                        originalMatrix.get(i + 2)[j] = '\0';
                    }

                } catch (IndexOutOfBoundsException e) { }
            }
        }
    }
}
