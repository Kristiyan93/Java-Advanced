package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class H_EvaluateExpression {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        Deque<String> operatorStack = new ArrayDeque<>();
        Deque<String> output = new ArrayDeque<>();
        Deque<Double> evaluateStack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            if (isNumeric(input[i])) {
                output.offer(input[i]);
            } else if (isOperator(input[i])) {
                Integer currentOperatorPrecedence = precedenceLevel(input[i]);

                if (!operatorStack.isEmpty()) {
                    while (precedenceLevel(operatorStack.peek()) >= currentOperatorPrecedence ) {
                        output.offer(operatorStack.pop());

                        if (operatorStack.isEmpty()) {
                            break;
                        }
                    }
                }

                operatorStack.push(input[i]);
            } else if (input[i].equals("(")) {
                operatorStack.push(input[i]);
            } else {
                if (!operatorStack.isEmpty()) {
                    while (!operatorStack.peek().equals("(")) {
                        output.offer(operatorStack.pop());

                        if (operatorStack.isEmpty()) {
                            break;
                        }
                    }

                    operatorStack.pop();
                }
            }
        }

        while (!operatorStack.isEmpty()) {
            output.offer(operatorStack.pop());
        }

        while (!output.isEmpty()) {
            String current = output.poll();

            if (isNumeric(current)) {
                evaluateStack.push(Double.valueOf(current));
            } else if (isOperator(current)) {
                Double first = evaluateStack.pop();
                Double second = evaluateStack.pop();

                if (current.equals("-")) {
                    evaluateStack.push(subtract(second, first));
                } else if (current.equals("+")) {
                    evaluateStack.push(sum(second, first));
                } else if (current.equals("*")) {
                    evaluateStack.push(multiply(second, first));
                } else {
                    evaluateStack.push(divide(second, first));
                }
            }
        }

        System.out.println(String.format("%.2f", evaluateStack.pop()));
    }

    private static double divide(double first, double second) {
        return first / second;
    }

    private static double multiply(double first, double second) {
        return first * second;
    }

    private static double sum(double first, double second) {
        return first + second;
    }

    private static double subtract(double first, double second) {
        return first - second;

    }


    private static boolean isOperator(String s) {
        switch (s) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }


    private static boolean isNumeric(String s) {
        if (s.matches("[a-zA-Z0-9]*")) {
            return true;
        }

        return false;
    }

    private static int precedenceLevel(String op) {
        switch (op) {
            case "*":
            case "/":
                return 3;
            case "+":
            case "-":
                return 2;
            default:
                return 1;
        }
    }
}
