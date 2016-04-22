package com.johansson.model.map;

/**
 * Created by chris on 2016-04-21.
 */
public class Tile {

    private static final int UP = 0, RIGHT = 1, DOWN = 2, LEFT = 3;

    private int tileId;
    private boolean[] collision;

    public Tile(int tileId) {
        this.tileId = tileId;
        this.collision = new boolean[4];
        for(int i=0; i<4; i++) {
            this.collision[i] = false;
        }
    }

    public static Tile newDefault() {
        //TODO implement
        return new Tile(0);
    }

    public int getTileId() {
        return tileId;
    }

    public boolean hasCollision(int direction) {
        return collision[direction];
    }
}
