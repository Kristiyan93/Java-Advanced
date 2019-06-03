package Lab.A_ShapesDrawing;

public class Circle implements Drawable {
    private Integer radius;
    private Integer centerX;
    private Integer centerY;

    public Circle(Integer radius, Integer centerX, Integer centerY) {
        this.setRadius(radius);
        this.setCenterX(centerX);
        this.setCenterY(centerY);
    }

    public Integer getRadius() {
        return radius;
    }

    private void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Integer getCenterX() {
        return centerX;
    }

    private void setCenterX(Integer centerX) {
        this.centerX = centerX;
    }

    public Integer getCenterY() {
        return centerY;
    }

    private void setCenterY(Integer centerY) {
        this.centerY = centerY;
    }

    @Override
    public void draw() {
        Double rIn = this.radius - 0.4;
        Double rOut = this.radius + 0.4;

        for (double i = this.radius; i >= -this.radius ; i--) {
            for (double j = -this.radius; j < rOut; j += 0.5) {
                Double value = j * j + i * i;

                if (value >= rIn * rIn && value <= rOut * rOut) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
