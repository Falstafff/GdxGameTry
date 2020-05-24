package com.falstaff.firstgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.concurrent.ThreadLocalRandom;

abstract class Circle {
    private float xPosition;
    private float yPosition;

    private float xSpeed;
    private float ySpeed;

    private Color color;
    private float radius;

    private ShapeRenderer shapeRenderer;


    Circle(float xPosition, float yPosition, float xSpeed, float ySpeed, ShapeRenderer shapeRenderer, Color color, float radius) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

        this.shapeRenderer = shapeRenderer;

        this.color = color;
        this.radius = radius;
    }


    void draw() {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(this.color);
        shapeRenderer.circle(this.xPosition, this.yPosition, radius);
        shapeRenderer.end();
    }

    abstract void move();

    boolean hasCollision(Circle circle) {
        double distance = Math.sqrt((
                Math.pow((circle.getXPosition() - this.getXPosition()), 2) + Math.pow((circle.getYPosition() - this.getYPosition()), 2)
        ));

        return distance < (this.radius + circle.radius);
    }

    void refreshPosition() {
        this.setXPosition(ThreadLocalRandom.current().nextInt(0, Gdx.graphics.getWidth()));
        this.setYPosition(ThreadLocalRandom.current().nextInt(0, Gdx.graphics.getHeight()));
    }

    void setXPosition(float xPosition) {
        this.xPosition = xPosition;
    }

    float getYPosition() {
        return yPosition;
    }

    void setYPosition(float yPosition) {
        this.yPosition = yPosition;
    }

    float getXSpeed() {
        return xSpeed;
    }

    void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    float getYSpeed() {
        return ySpeed;
    }

    void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    float getXPosition() {
        return xPosition;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
