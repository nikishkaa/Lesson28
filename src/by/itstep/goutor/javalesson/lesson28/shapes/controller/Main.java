package by.itstep.goutor.javalesson.lesson28.shapes.controller;

import by.itstep.goutor.javalesson.lesson28.shapes.model.data.Circle;
import by.itstep.goutor.javalesson.lesson28.shapes.model.data.Figure;
import by.itstep.goutor.javalesson.lesson28.shapes.model.data.Rectangle;
import by.itstep.goutor.javalesson.lesson28.shapes.model.logic.FigureManager;

public class Main {
    public static void main(String[] args) {

        test(new Rectangle(2, 5, 1, 1));
        test(new Circle(5, 3, 3));
        test(new Figure(5, 5));


    }

    public static void test(Figure figure) {

        System.out.println(FigureManager.checkQuarter(figure));
    }


}
