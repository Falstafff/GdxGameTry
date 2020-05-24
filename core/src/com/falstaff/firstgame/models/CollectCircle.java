package com.falstaff.firstgame.models;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class CollectCircle extends Circle {


    public CollectCircle(float xPosition, float yPosition, float xSpeed, float ySpeed, Color color, float radius) {
        super(xPosition, yPosition, xSpeed, ySpeed, color, radius);
    }

    @Override
    void move() { }
}
