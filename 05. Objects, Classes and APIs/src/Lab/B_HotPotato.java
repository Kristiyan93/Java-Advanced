package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class B_HotPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        Integer n = Integer.parseInt(reader.readLine());

        ArrayDeque<String> childrenNmae = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String name = input[i];
            childrenNmae.offer(name);
        }

        while (childrenNmae.size() > 1) {
            for (int i = 1; i < n; i++) {
                childrenNmae.offer(childrenNmae.poll());
            }

            System.out.println("Removed " + childrenNmae.poll());
        }

        System.out.printf("Last is %s", childrenNmae.poll());
    }
}
