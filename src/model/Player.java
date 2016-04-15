package model;

/**
 * Created by kollaps on 11.04.16.
 */
public class Player {

    private final String name;

    private final Figure figure;

    Player(final PlayerBuilder builder) {
        this.name = builder.getName();
        this.figure = builder.getFigure();
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
