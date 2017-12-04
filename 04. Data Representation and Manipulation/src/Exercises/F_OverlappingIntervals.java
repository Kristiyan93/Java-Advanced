package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeMap;

public class F_OverlappingIntervals {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Integer, Integer> intervals = getIntervals();

        System.out.println(checkForOverlap(intervals));
    }

    private static boolean checkForOverlap(TreeMap<Integer, Integer> intervals) {
        HashMap.Entry<Integer, Integer> first = intervals.firstEntry();
        intervals.remove(intervals.firstKey());
        Integer prevEnd = first.getValue();

        for (HashMap.Entry<Integer, Integer> integerIntegerEntry : intervals.entrySet()) {
            Integer currStart = integerIntegerEntry.getKey();

            if (prevEnd >= currStart) {
                return true;
            }

            prevEnd = integerIntegerEntry.getValue();
        }

        return false;
    }

    private static TreeMap<Integer, Integer> getIntervals() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());
        TreeMap<Integer, Integer> intervals = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] currentLine = reader.readLine().split(",");
            intervals.put(Integer.parseInt(currentLine[0]), Integer.parseInt(currentLine[1]));
        }

        return intervals;
    }
}
