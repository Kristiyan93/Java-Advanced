package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class C_MathPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        Integer n = Integer.parseInt(reader.readLine());

        ArrayDeque<String> childrenNmae = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String name = input[i];
            childrenNmae.offer(name);
        }

        Integer cycle = 1;

        while (childrenNmae.size() > 1) {
            for (int i = 1; i < n; i++) {
                childrenNmae.offer(childrenNmae.poll());
            }

            if (isPrime(cycle)) {
                System.out.printf("Prime %s%n", childrenNmae.peek());
            } else if (!isPrime(cycle)) {
                System.out.printf("Removed %s%n", childrenNmae.poll());
            }

            cycle++;
        }

        System.out.printf("Last is %s", childrenNmae.poll());

    }

    private static boolean isPrime(int cycle) {
        if (cycle < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(cycle) ; i++) {
            if (cycle % i == 0) {
                return false;
            }
        }

        return true;
    }
}