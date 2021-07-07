package coordinates.line;

public class CoordinatesLine {

    private final String DELETE_CHARACTER = "";
    private final String OPEN_PARENTHESES = "(";
    private final String CLOSE_PARENTHESES = ")";
    private final String SEPARATORS = ",";
    private final PointX pointX;
    private final PointY pointY;

    public CoordinatesLine(String input) {
        this.pointX = new PointX(changeCoordinate(input, 0));
        this.pointY = new PointY(changeCoordinate(input, 1));
    }

    public int changeCoordinate(String input, int index) {
        input = input.replace(OPEN_PARENTHESES, DELETE_CHARACTER)
                   .replace(CLOSE_PARENTHESES, DELETE_CHARACTER);

        return Integer.parseInt(input.split(SEPARATORS)[index]);
    }

    public PointX getPointX() {
        return pointX;
    }

    public PointY getPointY() {
        return pointY;
    }
}
