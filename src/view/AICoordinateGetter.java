package view;

import model.Field;
import model.Figure;
import model.Point;

/**
 * Created by kollaps on 19.04.16.
 */
public class AICoordinateGetter {

    public Point getMoveCoordinate(final Field field) {
        if(field.getFigure(new Point(1, 1)) == null) return new Point(1, 1);

        if(field.getFigure(new Point(0, 0)) == null) return new Point(0, 0);

        if(field.getFigure(new Point(0, 0)) == Figure.X) {
            if(field.getFigure(new Point(2, 2)) == null) return new Point(2, 2);

            if(field.getFigure(new Point(2, 0)) == null) return new Point(2, 0);

            if(field.getFigure(new Point(1, 0)) == null) {
                return new Point(1, 0);
            }
            else {
                return new Point(0, 2);
            }
        }

        if(field.getFigure(new Point(2, 0)) == null) return new Point(2, 0);

        if(field.getFigure(new Point(0, 2)) == null && field.getFigure(new Point(2, 0)) == Figure.X) {
            return new Point(0, 2);
        } else {
            return new RandomCoordinateGetter().getMoveCoordinate(field);
        }
    }

}
