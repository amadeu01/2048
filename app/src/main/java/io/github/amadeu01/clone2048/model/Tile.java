package io.github.amadeu01.clone2048.model;

/**
 * @Author Amadeu Cavalcante Filho
 * @Date 02/03/2018
 * @Email amadeu01@gmail.com
 */

public class Tile {

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void mergeWith(Tile tile) {
        setValue(this.value + tile.getValue());
        tile.setValue(0);
    }
}
