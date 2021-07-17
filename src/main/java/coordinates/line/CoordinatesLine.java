package coordinates.line;

import coordinates.Coordinates;

public class CoordinatesLine extends Coordinates {

    public CoordinatesLine(String input) {
        super(input);
    }

    public Point getPointX() {
        return this.pointX;
    }

    public Point getPointY() {
        return this.pointY;
    }
}
