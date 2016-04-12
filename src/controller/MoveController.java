package controller;

import model.Field;
import model.Point;

/**
 * Created by kollaps on 12.04.16.
 */
public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final String figure) {
        if (field.getFigure(point) != null) {
            return false;
        } else {
            field.setFigure(point, figure);
            return true;
        }

    }

}
