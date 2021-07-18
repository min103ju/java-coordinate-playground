package coordinates;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        validate(x, y);
        this.x = x;
        this.y = y;
    }

    private void validate(int x, int y) {
        if (x > 24 || y > 24) {
            throw new IllegalArgumentException("좌표는 24까지만 입력할 수 있습니다.");
        }
    }
}
