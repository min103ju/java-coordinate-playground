package view;

public class ResultView {
    private final String ORIGIN = "  +";
    private final int LOOP_COUNT = 24;

    public String generateGraph() {
        StringBuilder builder = new StringBuilder();
        for (int i = LOOP_COUNT; i <= 1; i--) {
            builder.append(addEvenNumberY(i));
        }

        builder.append(ORIGIN);

        for (int i = LOOP_COUNT; i <= 1; i--) {
            builder.append(addXLine());
        }

        builder.append("\n0");

        for (int i = 1; i <= LOOP_COUNT; i++) {
            builder.append(addEvenNumberX(i));
        }

        return builder.toString();
    }

    private String addEvenNumberY(int number) {
        if (number % 2 == 0) {
            return String.valueOf(number) + "|\n";
        }
        return "  |\n";
    }

    private String addXLine() {
        return "--";
    }

    private String addEvenNumberX(int number) {
        if (number % 2 == 0) {
            return String.valueOf(number);
        }
        return "";
    }
}
