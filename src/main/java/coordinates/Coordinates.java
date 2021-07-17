package coordinates;

import coordinates.line.Point;

public abstract class Coordinates {

    private final String DELETE_CHARACTER = "";
    private final String OPEN_PARENTHESES = "(";
    private final String CLOSE_PARENTHESES = ")";
    private final String SEPARATORS = ",";

    protected final Point pointX;
    protected final Point pointY;

    public Coordinates(String input) {
        this.pointX = new Point(changeCoordinate(input, 0));
        this.pointY = new Point(changeCoordinate(input, 1));
    }

    private int changeCoordinate(String input, int index) {
        input = input.replace(OPEN_PARENTHESES, DELETE_CHARACTER)
                .replace(CLOSE_PARENTHESES, DELETE_CHARACTER);

        return Integer.parseInt(input.split(SEPARATORS)[index]);
    }

    public double getDistance(Coordinates otherCoordinates) {
        return Math.sqrt(this.pointX.calculate(otherCoordinates.pointX)
                + this.pointY.calculate(otherCoordinates.pointY));
    }

}
