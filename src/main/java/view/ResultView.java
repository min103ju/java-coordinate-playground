package view;

public class ResultView {
    private static final String X_AXIS_WHITE_SPACE = "   ";
    private static final String Y_AXIS_WHITE_SPACE = "  |";
    private static final String X_AXIS_MARKER = "----";
    private static final String Y_AXIS_MARKER = "|";
    private static final String POINT = "*";
    private static final String ORIGIN = "  +";
    private static final String NONE = "";
    private static final int LOOP_COUNT = 24;

    public static String generateGraph(int x, int y) {
        StringBuilder yAxis = new StringBuilder();
        StringBuilder xAxis = new StringBuilder();

        for (int i = LOOP_COUNT; i >= 1; i--) {
            yAxis.append(addyAxis(i) + checkPointCoordinate(x, y, i)+ "\n");
        }

        yAxis.append(ORIGIN);

        for (int i = 0; i < LOOP_COUNT; i++) {
            xAxis.append(addxAxis());
        }

        xAxis.append("\n");
        xAxis.append("0");
        xAxis.append("  ");

        for (int i = 1; i <= LOOP_COUNT; i++) {
            xAxis.append(addxNumber(i));
        }

        yAxis.append(xAxis.toString());

        return yAxis.toString();
    }

    private static String addxLessTen(int number) {
        if (number < 10) {
            return " " + number;
        }
        return number + NONE;
    }

    private static String addxNumber(int number) {
        if (number % 2 == 0) {
            return X_AXIS_WHITE_SPACE + addxLessTen(number);
        }
        return X_AXIS_WHITE_SPACE;
    }

    private static String addxAxis() {
        return X_AXIS_MARKER;
    }

    private static String addyAxis(int number) {
        if (number % 2 == 0) {
            return addyLessTen(number);
        }
        return Y_AXIS_WHITE_SPACE;
    }

    private static String addyLessTen(int number) {
        if (number < 10) {
            return " " + number + Y_AXIS_MARKER;
        }
        return number + Y_AXIS_MARKER;
    }

    private static String pointCoordinate(int x) {
        StringBuilder builder = new StringBuilder();

        builder.append(" ");
        for (int i = 1; i < x; i++) {
            builder.append(" " + X_AXIS_WHITE_SPACE);
        }
        builder.append(POINT);

        return builder.toString();
    }

    public static String checkPointCoordinate(int x, int y, int loopCount) {
        if (y == loopCount) {
            return pointCoordinate(x);
        }
        return NONE;
    }
}
