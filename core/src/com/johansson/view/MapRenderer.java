package com.johansson.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector3;
import com.johansson.GameCamera;
import com.johansson.model.map.Map;
import com.johansson.model.map.MapLayer;
import com.johansson.model.map.Tile;

/**
 * Created by chris on 2016-04-22.
 */
public class MapRenderer {

    private Map map;
    private OrthographicCamera camera;

    private ShapeRenderer shapeRenderer;

    public MapRenderer(Map map, OrthographicCamera camera) {
        this.map = map;
        this.camera = camera;
        shapeRenderer = new ShapeRenderer();
    }

    public void render(int layer) {
        MapLayer mapLayer = map.getLayer(layer);
        shapeRenderer.setProjectionMatrix(camera.combined);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        Color color;
        for(int x=0; x<mapLayer.getWidth(); x++) {
            for(int y=0; y<mapLayer.getHeight(); y++) {
                Tile tile = mapLayer.getTile(x,y);
                if(tile != null){
                    switch (mapLayer.getTile(x, y).getTileId()) {
                        case 0:
                            color = Color.FOREST;
                            break;
                        default:
                            color = Color.GOLD;
                            break;
                    }
                    shapeRenderer.setColor(color);
                    shapeRenderer.rect(x,y,1,1);
                }
            }
        }
        shapeRenderer.end();
    }

    public void render(int[] layers) {
        for(int l : layers) {
            render(l);
        }
    }
}
