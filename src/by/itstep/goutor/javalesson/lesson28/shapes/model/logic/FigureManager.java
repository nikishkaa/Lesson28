package by.itstep.goutor.javalesson.lesson28.shapes.model.logic;

import by.itstep.goutor.javalesson.lesson28.shapes.model.data.Figure;

public class FigureManager {
    public static int checkQuarter(Figure figure) {

        int quarter = 0;

        int x = figure.getPoint().getX();
        int y = figure.getPoint().getY();

        if (x > 0 && y > 0) {
            quarter = 1;
        } else if (y > 0 && x < 0) {
            quarter = 2;
        } else if (x < 0 && y < 0) {
            quarter = 3;
        } else if (x > 0 && y < 0) {
            quarter = 4;
        }


        return quarter;
    }
}
