package Lab.B_MethodOverriding;

public class Square extends Rectangle {
    public Square(Double sideA) {
        super(sideA);
    }

    @Override
    public Double calculateArea() {
        return this.getSideA() * this.getSideA();
    }
}
