package model;

/**
 * Created by kollaps on 12.04.16.
 */
public class Point {
    // x, y имеют модификатор доступа default, то есть доступны всем членам того же пакета
    int x;

    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
