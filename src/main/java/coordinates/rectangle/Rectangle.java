package coordinates.rectangle;

import coordinates.Coordinates;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {

    private final List<RectangleCoordinates> coordinatesList;

    public Rectangle(List<RectangleCoordinates> coordinatesList) {
        this.coordinatesList = coordinatesList;
    }

    public double getAreaSize() {
        RectangleCoordinates temp = this.coordinatesList.get(0);
        double height = 0;
        double width = 0;
        for (RectangleCoordinates rectangleCoordinates : this.coordinatesList) {
            if (height == 0) {
                height = temp.getHeight(rectangleCoordinates);
            }

            if (width == 0) {
                width = temp.getWidth(rectangleCoordinates);
            }
        }
        return height * width;
    }
}
