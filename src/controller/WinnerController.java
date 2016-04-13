package controller;

import model.Field;
import model.Point;

/**
 * Created by kollaps on 13.04.16.
 */
public class WinnerController {

    public String getWinner(final Field field) {
        Point p1;
        Point p2;
        Point p3;

        for (int i = 0; i < field.getSize(); i++) {
            p1 = new Point(0, i);
            p2 = new Point(1, i);
            p3 = new Point(2, i);

            if (field.getFigure(p1) == field.getFigure(p2) &&
                    field.getFigure(p1) == field.getFigure(p3)
                    && field.getFigure(p1) != null) {
                return field.getFigure(p1);
            }
        }

        for (int i = 0; i < field.getSize(); i++) {
            p1 = new Point(i, 0);
            p2 = new Point(i, 1);
            p3 = new Point(i, 2);

            if (field.getFigure(p1) == field.getFigure(p2) &&
                    field.getFigure(p1) == field.getFigure(p3)
                    && field.getFigure(p1) != null) {
                return field.getFigure(p1);
            }
        }

        p1 = new Point(0, 0);
        p2 = new Point(1, 1);
        p3 = new Point(2, 2);

        if (field.getFigure(p1) == field.getFigure(p2) &&
                field.getFigure(p1) == field.getFigure(p3)
                && field.getFigure(p1) != null) {
            return field.getFigure(p1);
        }

        p1 = new Point(2, 0);
        p2 = new Point(1, 1);
        p3 = new Point(0, 2);

        if (field.getFigure(p1) == field.getFigure(p2) &&
                field.getFigure(p1) == field.getFigure(p3)
                && field.getFigure(p1) != null) {
            return field.getFigure(p1);
        }

        return null;
    }
}
