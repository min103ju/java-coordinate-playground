package coordinates.rectangle;

import coordinates.Coordinates;

public class RectangleCoordinates extends Coordinates {
    public RectangleCoordinates(String input) {
        super(input);
    }

    public RectangleCoordinates(int x, int y) {
        super(x, y);
    }

    public boolean isDiffer(RectangleCoordinates rectangleB) {
        return !this.pointX.equals(rectangleB.pointX) &&
                !this.pointY.equals(rectangleB.pointY);
    }
}
