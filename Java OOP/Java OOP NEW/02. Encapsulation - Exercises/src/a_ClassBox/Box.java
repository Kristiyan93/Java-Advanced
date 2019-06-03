package a_ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double calculateSurfaceArea() {
        return (2 * this.length * this.width) + (2 * this.length * this.height) + (2 * this.width * this.height);
        // 2lw + 2lh + 2wh
    }

    public Double calculateLateralSurfaceArea() {
        return (2 * this.length * this.height) + (2 * this.width * this.height);
        //2lh + 2wh
    }

    public Double calculateVolume() {
        return this.height * this.length * this.width;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f%n"
                , calculateSurfaceArea()
                , calculateLateralSurfaceArea()
                , calculateVolume());
    }
}
