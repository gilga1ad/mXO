package model;

import helpers.CoordinateHelper;

import java.util.Arrays;

/**
 * Created by kollaps on 11.04.16.
 */
public class Board {

    private static final int SIZE_FIELD = 3;

    // Двумерный массив
    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];
    // Другой вариант, но тогда придется инициализировать каждый объект массива: figures[0] = new Figure[SIZE_FIELD];
    //private Figure[][] figures = new Figure[SIZE_FIELD][];

    public void showBoard() {
        // Arrays.toString пойдет по всем элементам массива и вызовет toString у каждого элемента
        //System.out.println(Arrays.toString(this.figures));
        // Для многомерных массивов
        System.out.println(Arrays.deepToString(this.figures));
    }

    // Board имеет доступ к x, y, т. к. они объявлены как default
    public Figure getFigure(final Point point) {
        if(!CoordinateHelper.checkCoordinate(point.x) || !CoordinateHelper.checkCoordinate(point.y)) {
            return null;
        }
        return figures[point.x][point.y];
    }

    public boolean setFigure(final Point point , Figure figure) {
        if(!CoordinateHelper.checkCoordinate(point.x) || !CoordinateHelper.checkCoordinate(point.y)) {
            return false;
        }
        if(figures[point.x][point.y] != null) return false;

        figures[point.x][point.y] = figure;
        return true;
    }


}
