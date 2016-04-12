package model;

/**
 * Created by kollaps on 11.04.16.
 */
public class Field {

    private static int SIZE_FIELD = 3;

    public String[][] figures = new String[SIZE_FIELD][SIZE_FIELD];

    public int getSize() {
        return figures.length;
    }

    public String getFigure(final Point point) {
        return figures[point.x][point.y];
    }

    public void setFigure(final Point point, final String figure) {
        figures[point.x][point.y] = figure;
    }

}
