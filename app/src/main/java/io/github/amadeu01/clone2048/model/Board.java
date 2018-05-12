package io.github.amadeu01.clone2048.model;

import java.util.HashMap;

/**
 * @Author Amadeu Cavalcante Filho
 * @Date 02/03/2018
 * @Email amadeu01@gmail.com
 */

public class Board {

    private Tile[][] tiles = new Tile[4][4];

    /*
    *
    * | 0 | 0 | 0 | 0 |
    * | 0 | 0 | 0 | 0 |
    * | 0 | 0 | 0 | 0 |
    * | 0 | 0 | 0 | 0 |
    *
    * */
    public HashMap<String, String> newGame() {
        HashMap<String, String> tileHashMap = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Tile tile = new Tile(0, new Position(i, j));
                tileHashMap.put(tile.getPosition().toString(), tile.toTileValueString());
                tiles[i][j] = tile;
            }
        }

        return tileHashMap;
    }

    // Merge all tiles to right of the board
    public void moveRight() {

    }

    // Merge all tiles to left of the board
    public void moveLeft() {

    }

    // Merge all tiles to up
    public void moveUp() {

    }

    // Merge all tiles to down
    public void modeDown() {

    }

    private void mergeColumn(int column) {
        for (int i = 0; i < 4; i++) {
        }
    }

    private void mergeLine(int line) {
        for (int i = 0; i < 4; i++) {

        }
    }

    public void populateBoardRandom() {

    }

    public int getScore() {
        return 0;
    }
}
