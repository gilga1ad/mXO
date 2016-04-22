package m9e1_exceptions;

import controller.exceptions.FieldNotEmplyException;
import controller.exceptions.InvalidCoordinateException;
import helpers.CoordinateHelper;
import model.Board;
import model.Figure;
import model.Point;

/**
 * Created by kollaps on 22.04.16.
 */
public class GameRules {

    /**Метод, который кидает исключения, должен описывать все нестандартные варианты
     * выхода после ключевого слова throws**/
    public void move(final int x, final int y, final Board board, final Figure figure)
            throws FieldNotEmplyException, InvalidCoordinateException {

        /**Чтобы вызвать исключение, необходимо после ключевого слова throw создать
         * новый экземпляр исключения. Исключение это просто класс, который наследуется
         * от класса Exception**/
        if(!CoordinateHelper.checkCoordinate(x) || !CoordinateHelper.checkCoordinate(y)) {
            throw new InvalidCoordinateException();
        }

        if(board.getFigure(new Point(x, y)) != null) {
            throw new FieldNotEmplyException();
        }

        board.setFigure(new Point(x, y), figure);
    }

    /**Код, который вызывает метод move(), будет компилироваться только в том случае, если опишет
     * явно что нужно делать на каждый из exception-ов (через catch(){}). Сам код, с вызовом move(),
     * нужно заключить с секцию try{}**/
    public void makeMove() {
        final int x = getX();
        final int y = getY();
        final Board board = getBoard();
        try {
            move(x, y, board, Figure.O);
        /**До Java7, если 2 исключения выполняли одну и ту же логику, то для каждого из них всё равно
         * необходимо было писать свой catch. Начиная с Java7 внутрь catch-а можно поместить 2 (и более)
         * различных исключений.
         * Замечание: если 1-ым поставить глобальный класс Exception,
         * то код не скомпилируется по той просто причине, что не существует такой ситуации, в которой
         * Java дойдет до второго типа-исключения (любое исключение будет перехватывать класс Exception)**/
        } catch (InvalidCoordinateException | FieldNotEmplyException e) {
            e.printStackTrace();
        }
    }

    /**Если метод makeMove() не знает, что делать с исключениями, которые кидает move(),
     * то есть возможность выкинуть исключения ещё выше (в тот метод, который вызывает makeMove()),
     * добавив с сигнатуру метода makeMove() throw c соответствующими исключениями.**/
//    public void makeMove() throws FieldNotEmplyException, InvalidCoordinateException {
//        final int x = getX();
//        final int y = getY();
//        final Board board = getBoard();
//            move(x, y, board, Figure.O);
//    }

    private Board getBoard() {
        return null;
    }

    private int getX() {
        return 0;
    }

    private int getY() {
        return 0;
    }

}
