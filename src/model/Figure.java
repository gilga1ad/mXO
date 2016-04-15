package model;

/**
 * Created by kollaps on 12.04.16.
 */
// В Java все классы наследуются от класса Object, который имеет свой toString
//public class Figure /*extends Object*/ {

public enum Figure {

    X("X"), O("O");       // список констант (instance-ов класса)

    private final String figure;

/*    public Figure() {
        //this.figure = "X";    // нарушает принцип повторного использования кода
        // (такой код уже есть в конструкторе Figure(final String figure))
        // Вариант получше:
        this("X");  // вызывает конструктор Figure(final String figure)
    }*/

    Figure(final String figure) {       // В перечислении, конструктор не может быть public
        assert figure != null;
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

//    @Override     /*Не нужно определять свой toString(), по умолчанию для перечисления
//                  * Java сама напишет свой toString(), который превращает име экземпляря в String */
//    public String toString() {
//        return figure;
//    }
}
