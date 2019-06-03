package Lab.B_MethodOverriding;

public class Rectangle {
    private Double sideA;
    private Double sideB;

    public Rectangle(Double sideA) {
        this.sideA = sideA;
    }

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    protected Double getSideA() {
        return sideA;
    }

    public Double calculateArea() {
        return this.sideA * this.sideB;
    }
}
