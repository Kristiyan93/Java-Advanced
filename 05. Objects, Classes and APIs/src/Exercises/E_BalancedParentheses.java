package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class E_BalancedParentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Character> stack = new ArrayDeque<>();
        String input = reader.readLine();

        Integer middle = input.length() / 2;

        if (input.length() % 2 != 0) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < input.length() / 2; i++) {
            Character symbol = input.charAt(i);

            if (symbol == '{' || symbol == '['
                    || symbol == '('){
                stack.push(symbol);
            }
            if (symbol == '}' || symbol == ']'
                    || symbol == ')'){
                System.out.println("NO");
                return;
            }
        }
        boolean isBalanced = checkBalance(stack, input, middle);

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean checkBalance(ArrayDeque<Character> stack, String input, int middle) {
        for (int i = middle; i < input.length(); i++) {
            Character symbol = input.charAt(i);

            if (symbol == '{' || symbol == '['
                    || symbol == '(') {
                return false;
            }

            if (symbol == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (symbol == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (symbol == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return true;
    }
}
