package Labs.lab09;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
    // create an array of 3 shapes
    // call this array shapes
    Shape[] shapes = new Shape[10];

    Game() {
        Shape.setWorld(1000, 1000);

        shapes[0] = new Shape(50,  50,  20, 20,  6, 4, SHAPE_TYPE.Oval, Color.BLUE);
        shapes[1] = new Shape(200, 100, 30, 30, -4, 7, SHAPE_TYPE.Arc, Color.RED);
        shapes[2] = new Shape(400, 300, 40, 40,  8, -5, SHAPE_TYPE.Rectangle, Color.PINK);
        shapes[3] = new Shape(600, 150, 25, 25, -9, -3, SHAPE_TYPE.RoundRectangle, Color.GRAY);
        shapes[4] = new Shape(800, 500, 60, 60, 3, 5, SHAPE_TYPE.ThreeDRectangle, Color.CYAN);
        shapes[5] = new Shape(100, 700, 80, 80, 5, -2, SHAPE_TYPE.Oval, Color.BLUE);
        shapes[6] = new Shape(500, 800, 35, 35, -7, 9, SHAPE_TYPE.Arc, Color.RED);
        shapes[7] = new Shape(700, 650, 50, 50, -3, -6, SHAPE_TYPE.Rectangle, Color.PINK);
        shapes[8] = new Shape(300, 450, 15, 15, 12,  8, SHAPE_TYPE.RoundRectangle, Color.GRAY);
        shapes[9] = new Shape(900, 900, 100, 100, -2, -3, SHAPE_TYPE.ThreeDRectangle, Color.CYAN); 

        JFrame frame = new JFrame();
        this.setSize(Shape.worldW, Shape.worldH);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);        

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override        
            public void run() {
                draw();
            }
        };
        
        t.schedule(tt, 0, 50);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
            }
        });
        }
    
    public void draw() {
        for (Shape b: shapes) {
            b.move();
        }
        this.repaint();
    }
    
    public void paint(Graphics g) {
        g.drawRect(0, 0, Shape.worldW, Shape.worldH);
        for (Shape shape: shapes) {
            g.setColor(shape.getColor());
            switch (shape.getShapeType()) {
                case Rectangle       -> g.drawRect(shape.x, shape.y, shape.w, shape.h);
                case ThreeDRectangle -> g.draw3DRect(shape.x, shape.y, shape.w, shape.h, true);
                case RoundRectangle  -> g.drawRoundRect(shape.x, shape.y, shape.w, shape.h, 20, 20);
                case Oval            -> g.drawOval(shape.x, shape.y, shape.w, shape.h);
                case Arc             -> g.drawArc(shape.x, shape.y, shape.w, shape.h, 0, 270);
        }
        }
    }
}