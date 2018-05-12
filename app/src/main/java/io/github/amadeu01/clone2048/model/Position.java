package io.github.amadeu01.clone2048.model;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.valueOf(x) + String.valueOf(y);
    }
}
