package controller;

import model.Player;

/**
 * Created by kollaps on 11.04.16.
 */
public class Game {

    private static final String GAME_NAME = "XO";

    private Player[] players;

    public String getGameName() {
        return GAME_NAME;
    }

    public Player currentPlayer() {
        return null;
    }

    public Player[] getPlayers() {
        return players;
    }

    public boolean move(final int x, final int y) {
        return false;
    }

}
