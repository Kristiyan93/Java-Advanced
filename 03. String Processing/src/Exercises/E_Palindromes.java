package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class E_Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<String> palindromes = new TreeSet<>();

        String[] input = reader.readLine().split("[,?!.\\s+]");

        for (String word : input) {
            if (word.equals("")) {
                continue;
            }
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                palindromes.add(word);
            }
        }

        System.out.println(palindromes);
    }
}
