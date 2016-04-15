package view;

import controller.Game;
import model.Player;
import model.Point;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kollaps on 11.04.16.
 */
public class ConsoleView {

    protected final Game game;

    public ConsoleView(final Game game) {
        this.game = game;
    }

    public void start() {
        System.out.println("Please input coordinates: ");
        int x = getCoordinate("X");
        int y = getCoordinate("Y");
    }

    public void showGameName() {
        System.out.println(game.getName());
    }

    public void showPlayersName() {
        System.out.println(game.getPlayers());
    }

    private static final int LINE_SIZE = 12;

    public void showBoard() {
        for(int i = 0; i < 3; i = i + 1) {
            showBoardLine(i);
            showLine(LINE_SIZE);
        }
    }

    public void showPlayers() {
            // цикл for-each
            for(Player player : game.getPlayers()) {
                System.out.println(player.getName());
            }
    }

    private static final String LINE_CHARACTER = "~";

    protected void showLine(final int size) {
        for(int i = 0; i < size; i = i + 1) {
            System.out.print(LINE_CHARACTER);
        }
        System.out.println();
    }

    private void showBoardLine(final int row) {
        for(int i = 0; i < 3; i = i + 1) {
            System.out.print(game.getBoard().getFigure(new Point(row, i)));
        }
        System.out.println();
    }

    private int getCoordinate(final String coordinateName) {
        int counter = 0;    // счетчик
        do {
            System.out.print(String.format("Input the coordinate %s:", coordinateName));
            try {
                final Scanner in = new Scanner(System.in);
                return in.nextInt();
            } catch (final InputMismatchException e) {
                System.out.println("Coordinate is incorrect");
                counter += 1;
            }
        } while(counter < 3);
        return -1;  // Обязательно нужно вернуть цифру, т.к. цикл может закончится без return-а
    }
}
