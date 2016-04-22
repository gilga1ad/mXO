package model;

import helpers.CoordinateHelper;
import model.exceptions.InvalidPointException;

/**
 * Created by kollaps on 11.04.16.
 */
public class Field {

    private int size_field;

    private final Figure[][] figures;

    public Field(final int size_field) {
        this.size_field = size_field;
        figures = new Figure[size_field][size_field];
    }

    public int getSize() {
        return size_field;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if (!CoordinateHelper.checkCoordinate(point.getX()) || !CoordinateHelper.checkCoordinate(point.getY())) {
            throw new InvalidPointException();
        }
        return figures[point.getX()][point.getY()];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException {
        if (!CoordinateHelper.checkCoordinate(point.getX()) || !CoordinateHelper.checkCoordinate(point.getY())) {
            throw new InvalidPointException();
        }
        figures[point.getX()][point.getY()] = figure;
    }

}
