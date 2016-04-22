package com.johansson.controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.johansson.GameCamera;
import com.johansson.GameScreen;

/**
 * Created by chris on 2016-04-21.
 */
public class GameInputProcessor implements InputProcessor {

    private GameScreen gameScreen;
    private GameCamera camera;

    public GameInputProcessor(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
        this.camera = gameScreen.getCamera();
    }

    @Override
    public boolean keyDown(int keycode) {
        switch (keycode) {
            case Input.Keys.ESCAPE:
                Gdx.app.exit();
                break;
            case Input.Keys.LEFT:
                camera.moveLeft();
                break;
            case Input.Keys.RIGHT:
                camera.moveRight();
                break;
            case Input.Keys.UP:
                camera.moveUp();
                break;
            case Input.Keys.DOWN:
                camera.moveDown();
                break;
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        switch (keycode) {
            case Input.Keys.LEFT:
            case Input.Keys.RIGHT:
                camera.stopHorizontal();
                break;
            case Input.Keys.UP:
            case Input.Keys.DOWN:
                camera.stopVertical();
                break;

        }
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
