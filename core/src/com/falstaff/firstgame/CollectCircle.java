package com.falstaff.firstgame;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class CollectCircle extends Circle {


    CollectCircle(float xPosition, float yPosition, float xSpeed, float ySpeed, ShapeRenderer shapeRenderer, Color color, float radius) {
        super(xPosition, yPosition, xSpeed, ySpeed, shapeRenderer, color, radius);
    }

    @Override
    void move() { }
}
