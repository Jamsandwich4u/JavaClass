package Labs.lab09;

import java.awt.Color;

public class Shape {
    public int x, y, w, h;
    private int dirX, dirY;
    private Color colour;
    public static int worldW = 300, worldH = 300;

    private SHAPE_TYPE shapeType;

    public static void setWorld(int w, int h) {
        worldW = w;
        worldH = h;
    }

    public SHAPE_TYPE getShapeType() {
        return shapeType;
    }

    public Color getColor() {
        return colour;
    }

    public Shape (int x, int y, int w, int h, int dirX, int dirY, SHAPE_TYPE shapeType, Color colour) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirX = dirX;
        this.dirY = dirY;
        this.shapeType = shapeType;
        this.colour = colour;
    }

    public Shape (int x, int y, int w, int h) {
        this(x, y, w, h, 1, 1, SHAPE_TYPE.Oval, Color.BLACK);
    }

    public void move() {
        x += dirX;
        y += dirY;

        if (x < 0) {
            x = 0;
            dirX = -dirX;
        }
        if (y < 0) {
            y = 0;
            dirY = -dirY;
        }
        if (x > worldW - w) {
            x = worldW - w;
            dirX = -dirX;
        }
        if (y > worldH - h) {
            y = worldH - h;
            dirY = -dirY;
        }
    }
        
}
