package com.falstaff.firstgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends ApplicationAdapter {

	PlayerCircle circle;
	CollectCircle collectCircle;

	public Main() { }

	@Override
	public void create () {
		ShapeRenderer shapeRenderer = new ShapeRenderer();

		circle = new PlayerCircle(0, 0, 120, 60, shapeRenderer, Color.SKY, 20);

		collectCircle = new CollectCircle(Gdx.graphics.getWidth() / 2f, Gdx.graphics.getHeight() / 2f, 120, 60, shapeRenderer, Color.BLACK, 20);
	}

	@Override
	public void render () {
		init();

		if (circle.hasCollision(collectCircle)){
			collectCircle.refreshPosition();
		}

		collectCircle.draw();

		circle.draw();
		circle.move();
	}
	
	@Override
	public void dispose () {

	}

	private void init() {
		Gdx.gl.glClearColor(255,255,255, 9);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
}
