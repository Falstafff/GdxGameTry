package com.falstaff.firstgame.models;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class PlayerCircle extends Circle {
    public PlayerCircle(float xPosition, float yPosition, float xSpeed, float ySpeed, Color color, float radius) {
        super(xPosition, yPosition, xSpeed, ySpeed, color, radius);
    }

    @Override
    public void move() {
        if (Gdx.input.isKeyPressed(Input.Keys.W)){
            this.setYPosition(this.getYPosition() + 10);
        }

        if (Gdx.input.isKeyPressed(Input.Keys.S)){
            this.setYPosition(this.getYPosition() - 10);
        }

        if (Gdx.input.isKeyPressed(Input.Keys.D)){
            this.setXPosition(this.getXPosition() + 10);
        }

        if (Gdx.input.isKeyPressed(Input.Keys.A)){
            this.setXPosition(this.getXPosition() - 10);
        }

        if (this.getYPosition() > Gdx.graphics.getHeight() || this.getYPosition() < 0){
            this.setYPosition(Gdx.graphics.getHeight() - this.getYPosition());
        }


        if (this.getXPosition() > Gdx.graphics.getWidth() || this.getXPosition() < 0){
            this.setXPosition(Gdx.graphics.getWidth() - this.getXPosition());
        }
    }
}
