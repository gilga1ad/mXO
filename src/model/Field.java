package model;

/**
 * Created by kollaps on 11.04.16.
 */
public class Field {

    private static int SIZE_FIELD = 3;

    private final Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public int getSize() {
        return figures.length;
    }

    public Figure getFigure(final Point point) {
        return figures[point.getX()][point.getY()];
    }

    public void setFigure(final Point point, final Figure figure) {
        figures[point.getX()][point.getY()] = figure;
    }

}
