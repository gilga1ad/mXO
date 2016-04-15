package model;

/**
 * Created by kollaps on 15.04.16.
 */
public class PlayerBuilder {

    private String name;

    private Figure figure;

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }

    public PlayerBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder figure(final Figure figure) {
        this.figure = figure;
        return this;
    }

    public Player build() {
        return new Player(this);
    }

}
