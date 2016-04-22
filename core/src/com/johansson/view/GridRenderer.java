package com.johansson.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.johansson.model.map.Map;

/**
 * Created by chris on 2016-04-22.
 */
public class GridRenderer {

    private Map map;
    private OrthographicCamera camera;
    private ShapeRenderer shapeRenderer;
    private Color gridColor = Color.SCARLET;

    public GridRenderer(Map map, OrthographicCamera camera) {
        this.map = map;
        this.camera = camera;
        shapeRenderer = new ShapeRenderer();
    }

    public void render() {
        shapeRenderer.setProjectionMatrix(camera.combined);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(gridColor);
        for(int x=0; x<map.getWidth()+1; x++) {
            shapeRenderer.line(x,0,x,map.getHeight());
        }
        for(int y=0; y<map.getHeight()+1; y++) {
            shapeRenderer.line(0,y,map.getWidth(),y);
        }
        shapeRenderer.end();
    }
}
