package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L_ToTheStars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstStar = reader.readLine().split(" ");
        String firstStarName = firstStar[0].toLowerCase();
        Double fistStarX = Double.parseDouble(firstStar[1]);
        Double fistStarY = Double.parseDouble(firstStar[2]);

        String[] secondStar = reader.readLine().split(" ");
        String secoundStarName = secondStar[0].toLowerCase();
        Double secoundStarX = Double.parseDouble(secondStar[1]);
        Double secoundStarY = Double.parseDouble(secondStar[2]);

        String[] thirdStar = reader.readLine().split(" ");
        String thirdStarName = thirdStar[0].toLowerCase();
        Double thirdStarX = Double.parseDouble(thirdStar[1]);
        Double thirdStarY = Double.parseDouble(thirdStar[2]);

        String[] startCordinatio = reader.readLine().split(" ");
        Double startX = Double.parseDouble(startCordinatio[0]);
        Double startY = Double.parseDouble(startCordinatio[1]);

        Integer rotations = Integer.parseInt(reader.readLine());

        for (int i = 0; i <= rotations; i++) {
            if (fistStarX + 1 >= startX && startX >= fistStarX - 1 &&
                    fistStarY + 1 >= startY && startY >= fistStarY - 1) {
                System.out.println(firstStarName);
            } else if (secoundStarX + 1 >= startX && startX >= secoundStarX - 1 &&
                    secoundStarY + 1 >= startY && startY >= secoundStarY - 1) {
                System.out.println(secoundStarName);
            } else if (thirdStarX + 1 >= startX && startX >= thirdStarX - 1 &&
                    thirdStarY + 1 >= startY && startY >= thirdStarY - 1) {
                System.out.println(thirdStarName);
            } else {
                System.out.println("space");
            }
            startY += 1;
        }
    }
}
