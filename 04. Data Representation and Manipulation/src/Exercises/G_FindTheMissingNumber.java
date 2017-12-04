package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class G_FindTheMissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Set<Integer> fullSet = getFullSet(n);
        Set<Integer> arraySet = IntStream.of(Arrays.stream(reader.readLine().split("[, ]"))
                .filter(x -> !x.equals("")).mapToInt(Integer::parseInt)
                .toArray()).boxed().collect(Collectors.toSet());

        printMissingNumber(fullSet, arraySet);
    }

    private static void printMissingNumber(Set<Integer> fullSet, Set<Integer> arraySet) {
        fullSet.removeAll(arraySet);
        for (Integer integer : fullSet) {
            System.out.println(integer);
        }
    }

    private static Set<Integer> getFullSet(int n) {
        Set<Integer> fullSet = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            fullSet.add(i);
        }

        return fullSet;
    }
}
