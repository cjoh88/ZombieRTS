package com.johansson.model.map;

/**
 * Created by chris on 2016-04-21.
 */
public class MapLayer {

    private int width, height;

    private Tile[] tiles;

    public MapLayer(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width * height];
        /*for(int i=0; i<this.tiles.length; i++) {
            tiles[i] = Tile.newDefault();
            System.out.println(tiles[i].getTileId());
        }*/
    }

    public MapLayer(int width, int height, Tile[] tiles) {
        this.width = width;
        this.height = height;
        this.tiles = tiles;
    }

    public Tile getTile(int x, int y) {
        return tiles[y * width + x];
    }

    public void setTile(int x, int y, Tile tile) {
        tiles[y * width + x] = tile;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
