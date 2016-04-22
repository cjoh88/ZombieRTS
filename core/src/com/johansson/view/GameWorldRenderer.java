package com.johansson.view;

import com.johansson.GameCamera;
import com.johansson.model.GameWorld;

/**
 * Created by chris on 2016-04-22.
 */
public class GameWorldRenderer {

    private GameWorld gameWorld;
    private MapRenderer mapRenderer;

    private GameCamera camera;

    public GameWorldRenderer(GameWorld gameWorld, GameCamera camera) {
        this.gameWorld = gameWorld;
        this.camera = camera;
        mapRenderer = new MapRenderer(gameWorld.getMap(), camera);
    }

    public void render() {
        mapRenderer.render(0);
    }
}
