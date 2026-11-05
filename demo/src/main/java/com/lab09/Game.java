package com.lab09;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
    // create an array of 3 balls
    // call this array balls
    Ball[] balls = new Ball[10];

    Game() {
        Ball.setWorld(1000, 1000);

        balls[0] = new Ball(50,  50,  20, 20,  6,   4);
        balls[1] = new Ball(200, 100, 30, 30, -4,   7);
        balls[2] = new Ball(400, 300, 40, 40,  8,  -5);
        balls[3] = new Ball(600, 150, 25, 25, -9,  -3);
        balls[4] = new Ball(800, 500, 60, 60,  3,   5);
        balls[5] = new Ball(100, 700, 80, 80,  5,  -2);
        balls[6] = new Ball(500, 800, 35, 35, -7,   9);
        balls[7] = new Ball(700, 650, 50, 50, -3,  -6);
        balls[8] = new Ball(300, 450, 15, 15, 12,   8);
        balls[9] = new Ball(900, 900, 100, 100, -2, -3); 

        JFrame frame = new JFrame();
        this.setSize(Ball.worldW, Ball.worldH);
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
        // call the move() method of each balls
        // Tip: use an enhanced for loop to pick
        // each ball in the balls array.
        for (Ball b: balls) {
            b.move();
        }
        this.repaint();
    }
    
    public void paint(Graphics g) {
        g.drawRect(0, 0, Ball.worldW, Ball.worldH);
        // move and draw each ball in balls array
        // Tip: use an enhanced for loop to pick
        // each ball in the balls array.
        for (Ball b: balls) {
            g.drawOval(b.x, b.y, b.w, b.h);
        }
        }
}