package model;

/**
 * Created by kollaps on 11.04.16.
 */
public class Field {

    private static int SIZE_FIELD = 3;

    private final String[][] figures = new String[SIZE_FIELD][SIZE_FIELD];

    public int getSize() {
        return figures.length;
    }

    public String getFigure(final Point point) {
        return figures[point.getX()][point.getY()];
    }

    public void setFigure(final Point point, final String figure) {
        figures[point.getX()][point.getY()] = figure;
    }

}
