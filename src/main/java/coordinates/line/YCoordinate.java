package coordinates.line;

import java.util.Objects;

public class YCoordinate {
    private final int coordinate;

    public YCoordinate(int coordinate) {
        validateCoordinate(coordinate);
        this.coordinate = coordinate;
    }

    private void validateCoordinate(int coordinate) {
        if (coordinate > 24) {
            throw new IllegalArgumentException("좌표 값은 24를 넘을 수 없습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YCoordinate that = (YCoordinate) o;
        return coordinate == that.coordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }
}
