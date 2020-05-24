package com.falstaff.firstgame.lib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public abstract class Screen {
    abstract public void show();

    public void clear() {
        Gdx.gl.glClearColor(0, .25f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}
