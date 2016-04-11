package view;

import controller.Game;

/**
 * Created by kollaps on 11.04.16.
 */
public class AdvConsoleView extends ConsoleView {

    public AdvConsoleView(Game game) {
        super(game);
    }

    // Override
    @Override   // Аннотация
    public void showGameName() {
        System.out.println("***");
        System.out.println(game.getGameName());
    }
}
