import controller.Game;
import model.Board;
import model.Figure;
import model.Player;
import view.AdvConsoleView;
import view.ConsoleView;

/**
 * Created by kollaps on 11.04.16.
 */

public class Main {

    public static void main(String[] args) {
//        final Game game = new Game();
//        final ConsoleView consoleView = new ConsoleView(game);
//        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
//        startGame(advConsoleView);

//        Board board = new Board();
//        board.initArray();
//        board.showBoard();

        final Board board = new Board();
        final Game game = new Game("XO", new Player[]{new Player("Denis", new Figure("X")), new Player("Slava", new Figure("O"))}, board);
        //new ConsoleView(game).showBoard();
        //new ConsoleView(game).start();
        new ConsoleView(game).showPlayers();
    }

//    private static void startGame(final ConsoleView consoleView) {
//        consoleView.showGameName();
//    }

}
