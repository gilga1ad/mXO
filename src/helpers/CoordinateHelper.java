package helpers;

/**
 * Created by kollaps on 13.04.16.
 */
public class CoordinateHelper {

    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 2;

    public static boolean checkCoordinate(final int coordinate) {
        if(coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) return false;

        return true;
    }
}
