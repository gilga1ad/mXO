package controller;

import helpers.CoordinateHelper;
import model.Board;
import model.Player;

/**
 * Created by kollaps on 11.04.16.
 */
public class Game {

    private final static String DEFAULT_GAME_NAME = "XO";

    private final String name;

    private final Board board;

    private final Player[] players;

    Game(final GameBuilder builder) {
        this.players = builder.getPlayers();
        this.board = builder.getBoard();
        this.name = builder.getName();
    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y) {
        if(!CoordinateHelper.checkCoordinate(x) || !CoordinateHelper.checkCoordinate(y)) {
            return false;
        }

        // TODO logic for move

        return true;
    }

}
