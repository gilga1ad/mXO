package controller;

import helpers.CoordinateHelper;
import model.Board;
import model.Figure;
import model.Player;

/**
 * Created by kollaps on 11.04.16.
 */
public class Game {

    private final static String DEFAULT_GAME_NAME = "XO";

    private final String gameName;

    private final Board board;

    private final Player[] players;

    public Game(final String gameName, final Player[] players, final Board board) {
        this.players = players;
        this.board = board;
        if(gameName == null || gameName.isEmpty()) {
            this.gameName = DEFAULT_GAME_NAME;
        } else {
            this.gameName = gameName;
        }
    }

    public String getGameName() {
        return gameName;
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
