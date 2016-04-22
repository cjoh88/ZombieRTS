package com.johansson;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by chris on 2016-04-22.
 */
public class GameCamera extends OrthographicCamera {

    public Vector3 velocity;
    private float speed = 15;

    public GameCamera(int viewportWidth, int viewportHeight) {
        super(viewportWidth, viewportHeight);
        velocity = new Vector3();
    }

    public void moveUp() {
        velocity.y = speed;
    }

    public void moveDown() {
        velocity.y = -speed;
    }

    public void moveLeft() {
        velocity.x = -speed;
    }

    public void moveRight() {
        velocity.x = speed;
    }

    public void stopHorizontal() {
        velocity.x = 0;
    }

    public void stopVertical() {
        velocity.y = 0;
    }

    public void update(float delta) {
        position.add(velocity.cpy().scl(delta));
        super.update();
    }


}









