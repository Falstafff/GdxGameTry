package com.falstaff.firstgame.models;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Circle {
    private float xPosition;
    private float yPosition;

    private float xSpeed;
    private float ySpeed;

    private Color color;
    private float radius;

    Circle(float xPosition, float yPosition, float xSpeed, float ySpeed, Color color, float radius) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

        this.color = color;
        this.radius = radius;
    }

    abstract void move();

    public boolean hasCollision(Circle circle) {
        double distance = Math.sqrt((
                Math.pow((circle.getXPosition() - this.getXPosition()), 2) + Math.pow((circle.getYPosition() - this.getYPosition()), 2)
        ));

        return distance < (this.radius + circle.radius);
    }

    public void refreshPosition() {
        this.setXPosition(ThreadLocalRandom.current().nextInt(0, Gdx.graphics.getWidth()));
        this.setYPosition(ThreadLocalRandom.current().nextInt(0, Gdx.graphics.getHeight()));
    }

    public void setXPosition(float xPosition) {
        this.xPosition = xPosition;
    }

    public float getYPosition() {
        return yPosition;
    }

    public void setYPosition(float yPosition) {
        this.yPosition = yPosition;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getXPosition() {
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
