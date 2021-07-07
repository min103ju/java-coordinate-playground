package coordinates.line;

public class CoordinatesLine {

    private final String DELETE_CHARACTER = "";
    private final String OPEN_PARENTHESES = "(";
    private final String CLOSE_PARENTHESES = ")";
    private final String SEPARATORS = ",";
    private final XCoordinate xCoordinate;
    private final YCoordinate yCoordinate;

    public CoordinatesLine(String input) {
        this.xCoordinate = new XCoordinate(changeCoordinate(input, 0));
        this.yCoordinate = new YCoordinate(changeCoordinate(input, 1));
    }

    public int changeCoordinate(String input, int index) {
        input = input.replace(OPEN_PARENTHESES, DELETE_CHARACTER)
                   .replace(CLOSE_PARENTHESES, DELETE_CHARACTER);

        return Integer.parseInt(input.split(SEPARATORS)[index]);
    }

    public XCoordinate getxCoordinate() {
        return xCoordinate;
    }

    public YCoordinate getyCoordinate() {
        return yCoordinate;
    }
}
