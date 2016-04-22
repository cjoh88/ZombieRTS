package com.johansson;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.johansson.controller.GameInputProcessor;
import com.johansson.model.GameWorld;
import com.johansson.view.GameWorldRenderer;

/**
 * Created by chris on 2016-04-21.
 */
public class GameScreen implements Screen {

    private GameCamera camera;

    private GameInputProcessor inputProcessor;

    private GameWorld gameWorld;
    private GameWorldRenderer gameWorldRenderer;

    @Override
    public void show() {
        camera = new GameCamera(32,18);
        inputProcessor = new GameInputProcessor(this);
        Gdx.input.setInputProcessor(inputProcessor);
        gameWorld = new GameWorld();
        gameWorldRenderer = new GameWorldRenderer(gameWorld, camera);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update(delta);
        gameWorldRenderer.render();
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

    public GameCamera getCamera() {
        return camera;
    }
}
