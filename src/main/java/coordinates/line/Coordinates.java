package coordinates.line;

public class Coordinates {
    private final String OPEN_PARENTHESES = "(";
    private final String CLOSE_PARENTHESES = ")";
    private final String SEPARATORS = ",";
    private final int x;
    private final int y;

    public Coordinates(String input) {
        this.x = this.changeCoordinate(input, 0);
        this.y = this.changeCoordinate(input, 1);
    }

    public boolean isX(int x) {
        return this.x == x;
    }

    public boolean isY(int y) {
        return this.y == y;
    }

    public int changeCoordinate(String input, int index) {
        input = input.replace(OPEN_PARENTHESES, "")
                   .replace(CLOSE_PARENTHESES, "");

        return Integer.parseInt(input.split(SEPARATORS)[index]);
    }
}
