package com.johansson.editor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.johansson.controller.GameInputProcessor;
import com.johansson.model.GameWorld;
import com.johansson.model.map.Map;
import com.johansson.view.GameWorldRenderer;
import com.johansson.view.GridRenderer;
import com.johansson.view.MapRenderer;

/**
 * Created by chris on 2016-04-21.
 */
public class EditorScreen implements Screen {

    private EditorCamera camera;

    private EditorInputProcessor inputProcessor;

    //private GameWorld gameWorld;
    //private GameWorldRenderer gameWorldRenderer;
    private Map map;
    private MapRenderer mapRenderer;
    private GridRenderer gridRenderer;

    @Override
    public void show() {
        camera = new EditorCamera(32,18);
        inputProcessor = new EditorInputProcessor(this);
        Gdx.input.setInputProcessor(inputProcessor);
        map = Map.newDefault(128, 128, 3);
        mapRenderer = new MapRenderer(map, camera);
        gridRenderer = new GridRenderer(map, camera);

        //gameWorld = new GameWorld();
        //gameWorldRenderer = new GameWorldRenderer(gameWorld, camera);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update(delta);
        Gdx.gl.glViewport(0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        mapRenderer.render(0);
        gridRenderer.render();
        //gameWorldRenderer.render();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    public EditorCamera getCamera() {
        return camera;
    }
}
