package coordinates.line;

import java.util.Objects;

public class Point {
    private final int point;

    public Point(int point) {
        validatePoint(point);
        this.point = point;
    }

    private void validatePoint(int point) {
        if (point < 0) {
            throw new IllegalArgumentException("좌표 값은 0보다 작을 수 없습니다.");
        }

        if (point > 24) {
            throw new IllegalArgumentException("좌표 값은 24를 넘을 수 없습니다.");
        }
    }

    public int getPoint() {
        return point;
    }

    public int calculate(Point b) {
        return (int) Math.pow(this.point - b.point, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point1 = (Point) o;
        return point == point1.point;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point);
    }
}
