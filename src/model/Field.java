package model;

/**
 * Created by kollaps on 11.04.16.
 */
public class Field {

    public String f00;

    public String f01;

    public String f02;

    public String f10;

    public String f11;

    public String f12;

    public String f20;

    public String f21;

    public String f22;

    public int getSize() {
        return 3;
    }

    public String getFigure(final Point point) {

        if (point.x == 0 && point.y == 0)
            return f00;
        if (point.x == 1 && point.y == 0)
            return f10;
        if (point.x == 2 && point.y == 0)
            return f20;

        if (point.x == 0 && point.y == 1)
            return f01;
        if (point.x == 1 && point.y == 1)
            return f11;
        if (point.x == 2 && point.y == 1)
            return f21;

        if (point.x == 0 && point.y == 2)
            return f02;
        if (point.x == 1 && point.y == 2)
            return f12;
        if (point.x == 2 && point.y == 2)
            return f22;

        return "";

    }

    public void setFigure(final Point point, final String figure) {

        if (point.x == 0 && point.y == 0)
            f00 = figure;
        if (point.x == 1 && point.y == 0)
            f10 = figure;
        if (point.x == 2 && point.y == 0)
            f20 = figure;

        if (point.x == 0 && point.y == 1)
            f01 = figure;
        if (point.x == 1 && point.y == 1)
            f11 = figure;
        if (point.x == 2 && point.y == 1)
            f21 = figure;

        if (point.x == 0 && point.y == 2)
            f02 = figure;
        if (point.x == 1 && point.y == 2)
            f12 = figure;
        if (point.x == 2 && point.y == 2)
            f22 = figure;
    }

}
