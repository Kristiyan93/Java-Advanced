package Lab.C_Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public Shape() {
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    private void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return this.area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    public abstract Double calculatePerimeter();

    public abstract Double calculateArea();
}
