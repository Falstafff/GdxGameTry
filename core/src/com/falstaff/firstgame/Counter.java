package com.falstaff.firstgame;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Counter implements Drawable {
    private int score;

    private float positionX;
    private float positionY;

    Counter (float positionX, float positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void draw() {

    }
}
