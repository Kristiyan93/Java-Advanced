package Exercises.B_ClassBoxDataValidation;

public class Box {

    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setLength(Double length) {
        if (length < 1) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }

        this.length = length;
    }

    public void setWidth(Double width) {
        if (width < 1) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }

        this.width = width;
    }

    public void setHeight(Double height) {
        if (height < 1) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }

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
