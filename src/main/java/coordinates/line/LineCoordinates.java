package coordinates.line;

import coordinates.Coordinates;

public class LineCoordinates extends Coordinates {

    public LineCoordinates(String input) {
        super(input);
    }

    public Point getPointX() {
        return this.pointX;
    }

    public Point getPointY() {
        return this.pointY;
    }
}
