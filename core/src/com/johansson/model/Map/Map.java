package com.johansson.model.map;

/**
 * Created by chris on 2016-04-21.
 */
public class Map {

    private int width, height;
    private MapLayer[] layer;

    //TODO Load map from file
    public Map(int width, int height, int layers) {
        this.width = width;
        this.height = height;
        this.layer = new MapLayer[layers];
        for(int i=0; i<layers; i++) {
            this.layer[i] = new MapLayer(width, height);
        }
    }

    public static Map newDefault(int width, int height, int layers) {
        Map map = new Map(width, height, layers);
        MapLayer ground = map.getLayer(0);
        for(int x=0; x<width; x++) {
            for(int y=0; y<height; y++) {
                ground.setTile(x,y, Tile.newDefault());
            }
        }
        return map;
    }

    public MapLayer getLayer(int i) {
        return layer[i];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}
