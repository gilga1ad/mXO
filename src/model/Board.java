package model;

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

    public void initArray() {
        figures[0][0] = new Figure("O");
        figures[0][1] = new Figure("X");
    }

    public void showBoard() {
        // Arrays.toString пойдет по всем элементам массива и вызовет toString у каждого элемента
        //System.out.println(Arrays.toString(this.figures));
        // Для многомерных массивов
        System.out.println(Arrays.deepToString(this.figures));
    }

    public Figure getFigure(final Point point) {
        return figures[point.x][point.y];
    }
}
