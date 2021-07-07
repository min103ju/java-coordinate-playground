package coordinates.line;

import java.util.Objects;

public class PointY {
    private final int point;

    public PointY(int point) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointY that = (PointY) o;
        return point == that.point;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point);
    }

    public int calculate(PointY b) {
        return (int) Math.pow(this.point - b.point, 2);
    }
}
