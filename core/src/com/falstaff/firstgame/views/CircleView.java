package com.falstaff.firstgame.views;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.falstaff.firstgame.models.Circle;
import com.falstaff.firstgame.lib.View;

public class CircleView extends View {
    private Circle circle;
    private ShapeRenderer shapeRenderer;

    public CircleView(ShapeRenderer shapeRenderer) {
        this.shapeRenderer = shapeRenderer;
    }

    @Override
    public void render() {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(this.circle.getColor());
        shapeRenderer.circle(this.circle.getXPosition(), this.circle.getYPosition(), this.circle.getRadius());
        shapeRenderer.end();
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}
