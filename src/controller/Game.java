package controller;

import model.Player;

/**
 * Created by kollaps on 11.04.16.
 */
public class Game {

    private final String gameName;

    private Player[] players;

    public Game(String gameName) { this.gameName = gameName; }

    public String getGameName() {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public Player[] getPlayers() {
        return players;
    }

    private static final int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = 2;

    public boolean move(final int x, final int y) {
        if(!checkCoordinate(x) || !checkCoordinate(y)) {
            return false;
        }

        // TODO logic for move

        return true;
    }

    private static boolean checkCoordinate(final int coordinate) {
        if(coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) return false;

        return true;
    }

}
