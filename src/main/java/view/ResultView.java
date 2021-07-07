package view;

public class ResultView {
    private static final String ORIGIN = "  +";
    private static final int LOOP_COUNT = 24;

    public static String generateGraph() {
        StringBuilder builder = new StringBuilder();
        for (int i = LOOP_COUNT; i >= 1; i--) {
            builder.append(addEvenNumberY(i));
        }

        builder.append(ORIGIN);

        for (int i = 1; i <= LOOP_COUNT; i++) {
            builder.append(addXLine());
        }

        builder.append("\n 0 ");

        for (int i = 1; i <= LOOP_COUNT; i++) {
            builder.append(addEvenNumberX(i));
        }

        return builder.toString();
    }

    private static String addEvenNumberY(int number) {
        if (number % 2 == 0) {
            return addWhiteSpace(number) + String.valueOf(number) + "|\n";
        }
        return "  |\n";
    }

    private static String addWhiteSpace(int number) {
        if (number < 10) {
            return " ";
        }
        return "";
    }

    private static String addXLine() {
        return "----";
    }

    private static String addEvenNumberX(int number) {
        if (number % 2 == 0) {
            return String.valueOf(number);
        }
        return "    ";
    }
}
