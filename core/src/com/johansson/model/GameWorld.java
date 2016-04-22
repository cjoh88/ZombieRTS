package com.johansson.model;

import com.johansson.model.map.Map;

/**
 * Created by chris on 2016-04-21.
 */
public class GameWorld {

    private Map map;

    public GameWorld() {
        //this.map = new Map(128, 128, 1);
        this.map = Map.newDefault(128,128,1);
    }

    public Map getMap() {
        return map;
    }
}
