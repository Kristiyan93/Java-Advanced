package b_PointInRectangle;

public class Rectangle implements Contains {

    private Point topLeft;
    private Point bottomRight;

    public Rectangle() { }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }


    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    @Override
    public boolean isContains(Point point) {
        return isInHorizontal(point) && isInVertical(point);
    }

    private boolean isInVertical(Point point) {
        return this.topLeft.getY() <= point.getY() && this.bottomRight.getY() >= point.getY();
    }

    private boolean isInHorizontal(Point point) {
        return this.topLeft.getX() <= point.getX() && this.bottomRight.getX() >= point.getX();
    }
}
