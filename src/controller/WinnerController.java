package controller;

import model.Field;
import model.Point;

/**
 * Created by kollaps on 13.04.16.
 */
public class WinnerController {

    public String getWinner(final Field field) {
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        for (int i = 0; i < field.getSize(); i++) {
            p1.x = 0;
            p2.x = 1;
            p3.x = 2;

            p1.y = i;
            p2.y = i;
            p3.y = i;

            if (field.getFigure(p1) == field.getFigure(p2) &&
                    field.getFigure(p1) == field.getFigure(p3)
                    && field.getFigure(p1) != null) {
                return field.getFigure(p1);
            }
        }

        for (int i = 0; i < field.getSize(); i++) {
            p1.x = i;
            p2.x = i;
            p3.x = i;

            p1.y = 0;
            p2.y = 1;
            p3.y = 2;

            if (field.getFigure(p1) == field.getFigure(p2) &&
                    field.getFigure(p1) == field.getFigure(p3)
                    && field.getFigure(p1) != null) {
                return field.getFigure(p1);
            }
        }

        p1.x = 0;
        p2.x = 1;
        p3.x = 2;

        p1.y = 0;
        p2.y = 1;
        p3.y = 2;

        if (field.getFigure(p1) == field.getFigure(p2) &&
                field.getFigure(p1) == field.getFigure(p3)
                && field.getFigure(p1) != null) {
            return field.getFigure(p1);
        }


        p1.x = 2;
        p2.x = 1;
        p3.x = 0;

        p1.y = 0;
        p2.y = 1;
        p3.y = 2;

        if (field.getFigure(p1) == field.getFigure(p2) &&
                field.getFigure(p1) == field.getFigure(p3)
                && field.getFigure(p1) != null) {
            return field.getFigure(p1);
        }

        return null;
    }
}
