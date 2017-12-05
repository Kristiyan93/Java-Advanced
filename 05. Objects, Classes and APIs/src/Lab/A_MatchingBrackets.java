package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class A_MatchingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        ArrayDeque<Integer> stacks = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            Character symbol = input.charAt(i);

            if (symbol == '(') {
                stacks.push(i);
            } else if (symbol == ')') {
                Integer startIndex = stacks.pop();
                String result = input.substring(startIndex, i + 1);

                System.out.println(result);
            }
        }
    }
}
