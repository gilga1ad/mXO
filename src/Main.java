import com.sun.corba.se.impl.orbutil.closure.Constant;
import controller.Game;
import model.*;
import view.AdvConsoleView;
import view.ConsoleView;
import view.MenuView;

/**
 * Created by kollaps on 11.04.16.
 */

public class Main {

    public static void main(String[] args) {
//        final Board board = new Board();
//        final Game game = new Game("XO", new Player[]{new Player("Denis", new Figure("X")), new Player("Slava", new Figure("O"))}, board);
//        new ConsoleView(game).showBoard();

        /*Использование Buider серьезно уменьшает число ошибкок в коде (делает код более "чистым").
         * Его нужно использовать везде, где в конструкторе класса идет много однотипных аргументов.
         * Если в конструкторе немного аргументв, да ещё разного типа, то можно не использвать Builder,
         * т. к. если перепутать аргументы, то программа банально не скомпилируется.*/
        final Contact contact = new ContactBuilder().name("Denis")
                .surname("Galimov")
                .mail("test@ho.com")
                .address("ololo 27")
                .phone("12334567")
                .build();

    }

}
