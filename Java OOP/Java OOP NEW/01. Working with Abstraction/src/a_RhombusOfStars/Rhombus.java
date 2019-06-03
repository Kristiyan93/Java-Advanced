package a_RhombusOfStars;

public class Rhombus implements Drawable {
    private Integer n;

    public Rhombus(Integer n) {
        setN(n);
    }

    private void setN(Integer n) {
        this.n = n;
    }

    @Override
    public void draw() {
        for (int starCount = 1; starCount <= n; starCount++) {
            printRow(n, starCount);
        }
        for (int starCount = n - 1; starCount >= 1; starCount--) {
            printRow(n, starCount);
        }
    }

    private void printRow(int figureSize, int starCount){
        for (int i = 0; i < figureSize - starCount; i++)
            System.out.print(" ");
        for (int col = 1; col < starCount; col++) {
            System.out.print("* ");
        }

        System.out.println("*");
    }
}
