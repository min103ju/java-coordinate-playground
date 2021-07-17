package view;

import coordinates.line.LineCoordinates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    public static void InputValue() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("좌표를 입력하세요.");
        String inputValue = br.readLine();
        List<LineCoordinates> list = new ArrayList<>();

        int idx = 0;
        while (true && idx < 2) {
            try {
                list.add(new LineCoordinates(inputValue.split("-")[idx]));
                idx++;
            } catch (IllegalArgumentException e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }

        System.out.println(ResultView.generateGraph(list.get(0), list.get(1)));
    }
}
