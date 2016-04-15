package controller;

import model.Board;
import model.Player;

/**
 * Created by kollaps on 15.04.16.
 */

public class GameBuilder {

    private final static String DEFAULT_GAME_NAME = "XO";

    private Board board;

    private String name;

    private Player[] players;


    public GameBuilder players(final Player[] players) {
        this.players = players;
        return this;
    }

    public GameBuilder board(final Board board) {
        this.board = board;
        return this;
    }

    public GameBuilder name(final String name) {
        if(name == null || name.isEmpty()) {
            this.name = DEFAULT_GAME_NAME;
        } else {
            this.name = name;
        }
        return this;
    }

     public Player[] getPlayers() {
         return players;
     }

    public Board getBoard() {
        return board;
    }

    public String getName() {
        return name;
    }

    public Game build() {
        return new Game(this);
    }


}
