package com.falstaff.firstgame.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.falstaff.firstgame.lib.View;

public class TitleView extends View {
    private SpriteBatch batch;
    private BitmapFont font;

    public TitleView(SpriteBatch batch, BitmapFont font) {
        this.batch = batch;
        this.font = font;
    }

    @Override
    public void render() {
        batch.begin();
        font.draw(batch, "Main Screen!", Gdx.graphics.getWidth()*.25f, Gdx.graphics.getHeight() * .75f);
        font.draw(batch, "Click the circle to win.", Gdx.graphics.getWidth()*.25f, Gdx.graphics.getHeight() * .5f);
        font.draw(batch, "Press space to play.", Gdx.graphics.getWidth()*.25f, Gdx.graphics.getHeight() * .25f);
        batch.end();
    }
}
