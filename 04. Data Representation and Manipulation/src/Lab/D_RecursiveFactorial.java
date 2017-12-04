package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_RecursiveFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer num = Integer.parseInt(reader.readLine());

        System.out.println(factorial(num));
    }

    private static long factorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
