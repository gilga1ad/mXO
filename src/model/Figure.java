package model;

/**
 * Created by kollaps on 12.04.16.
 */
// В Java все классы наследуются от класса Object, который имеет свой toString
public class Figure /*extends Object*/ {

    private final String figure;

/*    public Figure() {
        //this.figure = "X";    // нарушает принцип повторного использования кода
        // (такой код уже есть в конструкторе Figure(final String figure))
        // Вариант получше:
        this("X");  // вызывает конструктор Figure(final String figure)
    }*/

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
