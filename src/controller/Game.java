package controller;

import model.Board;
import model.Figure;
import model.Player;

/**
 * Created by kollaps on 11.04.16.
 */
public class Game {

    private final String gameName;

    private final Board board;

    private final Player[] players;

    public Game(final String gameName, final Player[] players, final Board board) {
        this.players = players;
        this.board = board;
        if(gameName == null || gameName.isEmpty()) {
            this.gameName = "XO";
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
