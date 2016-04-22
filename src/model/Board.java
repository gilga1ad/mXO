package model;

import helpers.CoordinateHelper;
import model.exceptions.InvalidPointException;

import java.util.Arrays;

/**
 * Created by kollaps on 11.04.16.
 */
public class Board {

    private static final int SIZE_FIELD = 3;

    /***Двумерный массив**/
    private final Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];
    /**Другой вариант, но тогда придется инициализировать каждый объект массива: figures[0] = new Figure[SIZE_FIELD];**/
    //private Figure[][] figures = new Figure[SIZE_FIELD][];

    public int getSize() {
        return figures.length;
    }

    public void showBoard() {
        /**Arrays.toString пойдет по всем элементам массива и вызовет toString у каждого элемента**/
        //System.out.println(Arrays.toString(this.figures));
        /**Для многомерных массивов**/
        System.out.println(Arrays.deepToString(this.figures));
    }

    /**Board имеет доступ к x, y, т. к. они объявлены как default**/
    public Figure getFigure(final Point point) throws InvalidPointException {
        if (!CoordinateHelper.checkCoordinate(point.getX()) || !CoordinateHelper.checkCoordinate(point.getY())) {
            throw new InvalidPointException();
        }
        return figures[point.getX()][point.getY()];
    }

    public void setFigure(final Point point , final Figure figure) throws InvalidPointException {
        if (!CoordinateHelper.checkCoordinate(point.getX()) || !CoordinateHelper.checkCoordinate(point.getY())) {
            throw new InvalidPointException();
        }
        figures[point.getX()][point.getY()] = figure;
    }


}
