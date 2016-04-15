package controller;

import model.Field;
import model.Figure;
import model.Point;

/**
 * Created by kollaps on 13.04.16.
 */
public class WinnerController {

    public Figure getWinner(final Field field) {
        Figure winner;
        for (int i = 0; i < field.getSize(); i++) {
            winner = checkRow(field, i);
            if (winner != null) return winner;
            winner = checkColumn(field, i);
            if (winner != null) return winner;
        }
        winner = checkDiag1(field);
        if (winner != null) return winner;
        winner = checkDiag2(field);
        if (winner != null) return winner;

        return null;
    }

    private Figure checkDiag1(final Field field) {
        final Point p1 = new Point(0, 0);
        final Point p2 = new Point(1, 1);
        final Point p3 = new Point(2, 2);

        if (field.getFigure(p1) != null && field.getFigure(p2) != null &&
                field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    private Figure checkDiag2(final Field field) {
        final Point p1 = new Point(2, 0);
        final Point p2 = new Point(1, 1);
        final Point p3 = new Point(0, 2);

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    private Figure checkColumn(final Field field, final Integer i) {
        final Point p1 = new Point(0, i);
        final Point p2 = new Point(1, i);
        final Point p3 = new Point(2, i);

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    private Figure checkRow(final Field field, final Integer i) {
        final Point p1 = new Point(i, 0);
        final Point p2 = new Point(i, 1);
        final Point p3 = new Point(i, 2);

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }
}
