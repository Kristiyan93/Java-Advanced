package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O_ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("[\\s+()\\\\/]");

        Pattern regex = Pattern.compile("^[A-Za-z][A-Za-z0-9_]{2,25}$");
        List<String> users = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            Matcher matcher = regex.matcher(input[i]);

            if (matcher.find()) {
                users.add(input[i]);
            }
        }

        Integer longest = Integer.MIN_VALUE;
        String firstUser = "";
        String secondUser = "";

        for (int i = 0; i < users.size() - 1; i++) {
            Integer sum = users.get(i).length() + users.get(i + 1).length();

            if (sum > longest) {
                longest = sum;
                firstUser = users.get(i);
                secondUser = users.get(i + 1);
            }
        }

        System.out.println(firstUser);
        System.out.println(secondUser);
    }
}