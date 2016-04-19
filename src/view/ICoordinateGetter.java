package view;

import model.Field;
import model.Point;

/**
 * Created by kollaps on 17.04.16.
 */
public interface ICoordinateGetter {

    Point getMoveCoordinate(final Field field);

}
