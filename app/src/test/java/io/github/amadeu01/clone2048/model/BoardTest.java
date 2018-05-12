package io.github.amadeu01.clone2048.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Before
    public void setUp() throws Exception {

    }

    /*
     *
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     * */
    @Test
    public void newGame() {
    }

    /*
     *
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 2 | 2 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     *
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 4 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     * */
    @Test
    public void moveRight() {

    }

    /*
     *
     * | 0 | 0 | 0 | 0 |
     * | 2 | 2 | 2 | 2 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     *
     * | 0 | 0 | 0 | 0 |
     * | 4 | 4 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     * */
    @Test
    public void moveLeft() {
    }

    /*
     *
     * | 0 | 0 | 2 | 0 |
     * | 0 | 0 | 2 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     *
     * | 0 | 0 | 4 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     * */
    @Test
    public void moveUp() {
    }

    /*
     *
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     * */
    @Test
    public void modeDown() {
    }

    /*
     *
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     * Random 2
     *
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 2 | 0 |
     *
     * Random 4
     *
     * | 0 | 0 | 0 | 0 |
     * | 0 | 4 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     * | 0 | 0 | 0 | 0 |
     *
     * */
    @Test
    public void populateBoardRandom() {
        // Should generate 80% '2' and 20% '4', than apply to a random available
        // position on the board
    }

    @Test
    public void getScore() {
    }
}