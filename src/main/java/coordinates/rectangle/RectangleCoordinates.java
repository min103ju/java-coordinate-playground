package coordinates.rectangle;

import coordinates.Coordinates;

public class RectangleCoordinates extends Coordinates {
    public RectangleCoordinates(String input) {
        super(input);
    }

    public RectangleCoordinates(int x, int y) {
        super(x, y);
    }

    public double getHeight(RectangleCoordinates rectangleCoordinates) {
        if (!this.pointX.equals(rectangleCoordinates.pointX) && this.pointY.equals(rectangleCoordinates.pointY)) {
            return this.getDistance(rectangleCoordinates);
        }
        return 0;
    }

    public double getWidth(RectangleCoordinates rectangleCoordinates) {
        if (this.pointX.equals(rectangleCoordinates.pointX) && !this.pointY.equals(rectangleCoordinates.pointY)) {
            return this.getDistance(rectangleCoordinates);
        }
        return 0;
    }
}
