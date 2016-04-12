package model;

/**
 * Created by kollaps on 12.04.16.
 */
// В Java все классы наследуются от класса Object, который имеет свой toString
public class Figure /*extends Object*/ {

    private final String figure;

    public Figure(final String figure) {
        assert figure != null;
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return figure;
    }
}
