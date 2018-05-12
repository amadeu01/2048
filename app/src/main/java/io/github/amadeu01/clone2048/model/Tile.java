package io.github.amadeu01.clone2048.model;

/**
 * @Author Amadeu Cavalcante Filho
 * @Date 02/03/2018
 * @Email amadeu01@gmail.com
 */

public class Tile {

    private int value;
    private Position position;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Tile(int value, Position position) {
        this.value = value;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "value=" + value +
                ", position=" + position +
                '}';
    }

    public String toTileValueString() {
        return String.valueOf(value);
    }

    public void mergeWith(Tile tile) {
        setValue(this.value + tile.getValue());
        tile.setValue(0);
    }

    public int getBackground() {
        switch (value) {
            case 2:
                return 0xeee4da;
            case 4:
                return 0xede0c8;
            case 8:
                return 0xf2b179;
            case 16:
                return 0xf59563;
            case 32:
                return 0xf67c5f;
            case 64:
                return 0xf65e3b;
            case 128:
                return 0xedcf72;
            case 256:
                return 0xedcc61;
            case 512:
                return 0xedc850;
            case 1024:
                return 0xedc53f;
            case 2048:
                return 0xedc22e;
        }

        return 0xcdc1b4;
    }

    public int getForeground() {
        return value < 16 ? 0x776e65 : 0xf9f6f2;
    }
}
