package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class F_SimpleTextEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        String currentString = "";
        Stack<String> stack = new Stack<>();
        stack.push(currentString);

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            if (input[0].equals("1")) {
                currentString += input[1];
                stack.push(currentString);
            } else if (input[0].equals("2")) {
                Integer countOfLast = Integer.parseInt(input[1]);

                currentString = currentString.substring(0, currentString.length() - countOfLast);
                stack.push(currentString);
            } else if (input[0].equals("3")) {
                Integer indexForPrint = Integer.parseInt(input[1]);

                System.out.println(currentString.charAt(indexForPrint - 1));
            } else if (input[0].equals("4")) {
                stack.pop();
                currentString = stack.peek();
            }
        }
    }
}
