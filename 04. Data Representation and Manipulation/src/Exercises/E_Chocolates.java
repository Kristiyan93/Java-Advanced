package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class E_Chocolates {
    private static int bestMin = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer length = Integer.parseInt(reader.readLine());
        int[] line = getArray(reader.readLine());
        Integer count = Integer.parseInt(reader.readLine());

        Arrays.sort(line);
        getMinDiff(line, count);

        System.out.printf("Min Difference is %d.", bestMin);
    }

    private static void getMinDiff(int[] line, int count) {
        findBestCouple(line, 0, line.length - 1, count);
    }

    private static void findBestCouple(int[] line, int i, int j, int count) {
        if (i + count > j + 1) {
            return;
        }
        Integer currentCouple = getCurrentCollection(line, count, i);

        if (bestMin > currentCouple) {
            bestMin = currentCouple;
        }

        findBestCouple(line, i + 1, j, count);
    }

    private static int getCurrentCollection(int[] line, int count, int i) {
        int first = line[i];
        int last = line[count + i - 1];
        return Math.abs(last - first);
    }

    private static int[] getArray(String s) {
        return Arrays.stream(s.split("[ ,]")).filter(x -> !x.equals("")).mapToInt(Integer::parseInt).toArray();
    }
}
