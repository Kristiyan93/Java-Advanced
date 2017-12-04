package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class E_RecursiveDrawing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        printFigure(n);
    }

    private static void printFigure(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(String.join("", Collections.nCopies(n, "*")));

        printFigure(n - 1);

        System.out.println(String.join("", Collections.nCopies(n, "#")));
    }
}
