package Exercises.A_ClassBox;

public class Box {

    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double surfaceArea () {
        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public Double lateralSurfaceArea() {
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public Double volume() {
        return this.length * this.width * this.height;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f%n", surfaceArea(), lateralSurfaceArea(), volume());
    }
}
