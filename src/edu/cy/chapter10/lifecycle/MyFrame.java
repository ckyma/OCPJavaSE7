package edu.cy.chapter10.lifecycle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by metastock on 1/3/2017.
 */

class MovingBall extends Thread{
    int radius;
    Graphics g;
    int xPos, yPos;
    JFrame frame;
    MovingBall(int radius, JFrame frame){
        this.radius = radius;
        this.g = frame.getGraphics();
        this.frame = frame;
    }
    public void run(){
        while(true){
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
            ++xPos;
            ++yPos;
            g.setColor(Color.BLACK);
            g.fillOval(xPos, yPos, radius, radius);
        }
    }
}

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setVisible(true);
        MovingBall ball = new MovingBall(60, frame);
        ball.start();
    }
}
