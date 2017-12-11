package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E_BalancedParentheses2 {
    private static ArrayDeque<Character> stack;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        stack = new ArrayDeque<>();

        char[] input = scanner.nextLine().toCharArray();

        if (input.length % 2 == 0) {
            pushStack(stack, input);
            isBalanced(stack);
        } else {
            System.out.println("NO");
        }
    }

    private static void isBalanced(ArrayDeque<Character> stack) {
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void pushStack(ArrayDeque<Character> stack, char[] input) {
        for (int i = 0; i < input.length; i++) {
            char symbol = input[i];

            switch (symbol) {
                case '(':
                    stack.push(symbol);
                    break;
                case '{':
                    stack.push(symbol);
                    break;
                case '[':
                    stack.push(symbol);
                    break;
                case ']':
                    if (stack.peek() == '[') {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (stack.peek() == '{') {
                        stack.pop();
                    }
                    break;
                case ')':
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                    break;
            }
        }
    }
}
