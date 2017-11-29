package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class F_MagicExchangeableWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        if (input[0].length() > input[1].length()) {
            System.out.println(exchangableWords(input[1], input[0]));
        } else {
            System.out.println(exchangableWords(input[0], input[1]));
        }
    }

    private static boolean exchangableWords(String s, String s1) {
        HashMap<Character, Character> store = new HashMap<>();

        StringBuilder firstWord = new StringBuilder();
        StringBuilder secondWord = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!firstWord.toString().contains(s.charAt(i) + "")) {
                firstWord.append(s.charAt(i));
            }

            if (store.containsKey(s.charAt(i))) {
                if (store.get(s.charAt(i)) != s1.charAt(i)) {
                    return false;
                }
            } else {
                store.put(s.charAt(i), s1.charAt(i));
            }
        }

        for (int i = 0; i < s1.length(); i++) {
            if(!secondWord.toString().contains(s1.charAt(i) + "")) {
                secondWord.append(s1.charAt(i));
            }
        }

        return firstWord.length() == secondWord.length();
    }
}
