package coordinates;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        validate(x, y);
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    private void validate(int x, int y) {
        if (x > 24 || y > 24) {
            throw new IllegalArgumentException("좌표는 24까지만 입력할 수 있습니다.");
        }
    }

    public double getDistance(Point otherPoint) {
        return Math.sqrt(
                Math.pow(minusX(otherPoint), 2) + Math.pow(minusY(otherPoint), 2)
        );
    }

    private double minusY(Point otherPoint) {
        return this.y - otherPoint.y;
    }

    private double minusX(Point otherPoint) {
        return this.x - otherPoint.x;
    }
}
