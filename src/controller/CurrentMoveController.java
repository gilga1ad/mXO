package controller;

import model.Field;
import model.Point;

/**
 * Created by kollaps on 12.04.16.
 */
public class CurrentMoveController {

    public String currentMove(final Field field) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            countFigure += countFiguresInTheRow(field, x);
        }

        if (countFigure == field.getSize() * field.getSize())
            return null;

        if (countFigure % 2 == 0)
            return "X";

        return "O";
    }

    private int countFiguresInTheRow(final Field field, final Integer row) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            Point p = new Point(x, row);

            if (field.getFigure(p) != null)
                countFigure++;
        }
        return countFigure;
    }

}
