package view;

import model.Field;
import model.Point;

import java.util.Random;

/**
 * Created by kollaps on 17.04.16.
 */

public class RandomCoordinateGetter implements ICoordinateGetter {

    private static final Random RANDOM = new Random();

    @Override
    public Point getMoveCoordinate(final Field field) {
        Point result = getRandomPoint();
        while (field.getFigure(result) != null) {
            result = getRandomPoint();
        }
        return result;
    }

    private Point getRandomPoint() {
        return new Point(
                getRandomInt(),
                getRandomInt()
        );
    }

    private int getRandomInt() {
        return Math.abs(RANDOM.nextInt() % 3);
    }

}

