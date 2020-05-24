package com.falstaff.firstgame;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class CircleFactory {

    ShapeRenderer shapeRenderer;

    public CircleFactory(ShapeRenderer shapeRenderer) {
        this.shapeRenderer = shapeRenderer;
    }

    public ArrayList<Circle> create(int quantity) {
        ArrayList<Circle> circlesList = new ArrayList<>();

        int x;
        int y;

        int xSpeed;
        int ySpeed;

        Color color;

        ArrayList<Color> colors = new ArrayList<>();

        colors.add(Color.BLUE);
        colors.add(Color.GOLD);
        colors.add(Color.GOLDENROD);
        colors.add(Color.GRAY);
        colors.add(Color.ORANGE);
        colors.add(Color.MAGENTA);
        colors.add(Color.BROWN);
        colors.add(Color.SKY);

        int radius;

        for (int i = 0; i < quantity; i++){
            x = getRandomValue(0, 300);
            y = getRandomValue(0, 300);

            xSpeed = getRandomValue(100, 300);
            ySpeed = getRandomValue(50, 200);

            radius = getRandomValue(30, 60);

            color = getRandomColor(colors);

            //circlesList.add(new Circle(x, y, xSpeed, ySpeed, shapeRenderer, color, radius));
        }

        return circlesList;
    }

    private int getRandomValue(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private Color getRandomColor(ArrayList<Color> colors) {
        return colors.get(ThreadLocalRandom.current().nextInt(colors.size()));
    }
}
