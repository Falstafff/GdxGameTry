package com.falstaff.firstgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.falstaff.firstgame.Main;
import com.falstaff.firstgame.models.CollectCircle;
import com.falstaff.firstgame.models.PlayerCircle;
import com.falstaff.firstgame.views.CircleView;

public class GameScreen implements Screen {
    private Main game;

    private CircleView circleView;

    private PlayerCircle playerCircle;
    private CollectCircle collectCircle;

    GameScreen(Main game) {
        this.game = game;

        this.circleView = new CircleView(game.getShapeRenderer());

        this.playerCircle = new PlayerCircle(0, 0, 120, 60, Color.SKY, 20);
        this.collectCircle = new CollectCircle(Gdx.graphics.getWidth() / 2f, Gdx.graphics.getHeight() / 2f, 120, 60, Color.BLACK, 20);;
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean keyDown(int keycode) {
                if (keycode == Input.Keys.SPACE){
                    game.setScreen(new TitleScreen(game));
                }
                return true;
            }
        });
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, .25f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        circleView.setCircle(playerCircle);
        circleView.render();

        circleView.setCircle(collectCircle);
        circleView.render();

        if (playerCircle.hasCollision(collectCircle)){
            collectCircle.refreshPosition();
        }

        playerCircle.move();
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
}
