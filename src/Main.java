import controller.Game;
import view.AdvConsoleView;
import view.ConsoleView;

/**
 * Created by kollaps on 11.04.16.
 */

public class Main {

    public static void main(String[] args) {
        final Game game = new Game();
        final ConsoleView consoleView = new ConsoleView(game);
        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
        startGame(advConsoleView);
    }

    private static void startGame(final ConsoleView consoleView) {
        consoleView.showGameName();
    }

}
