package controller;

import model.Field;
import model.Point;

/**
 * Created by kollaps on 12.04.16.
 */
public class CurrentMoveController {

    public String currentMove(final Field field) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < field.getSize(); i++)
            for (int j = 0; j < field.getSize(); j++) {
                final Point p = new Point(i, j);
                final String figure = field.getFigure(p);
                
                if (figure == null) continue;

                if (figure == "X") {
                    x++;
                } else {
                    y++;
                }
            }
        return x == y ? "X" : "O";
    }

}
