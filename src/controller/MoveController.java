package controller;

import controller.exceptions.FieldNotEmplyException;
import controller.exceptions.InvalidCoordinateException;
import model.Board;
import model.Field;
import model.Figure;
import model.Point;
import model.exceptions.InvalidPointException;

import java.security.InvalidAlgorithmParameterException;

/**
 * Created by kollaps on 12.04.16.
 */
public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException, FieldNotEmplyException {
        if (field.getFigure(point) != null) {
            throw new FieldNotEmplyException();
        }
        field.setFigure(point, figure);
    }

}
