package b_PointInRectangle;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::new)
                .collect(Collectors.toList());
        Point left = getPoint(list, 0, 1);
        Point right = getPoint(list, 2, 3);

        Contains contains = new Rectangle(left, right);

        Integer n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            List<Integer> points = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Integer::new)
                    .collect(Collectors.toList());

            Point point = getPoint(points, 0, 1);

            System.out.println(contains.isContains(point));
        }
    }

    private static Point getPoint(List<Integer> list, int index1, int index2) {
        return new Point(list.get(index1), list.get(index2));
    }
}
