import java.awt.*;
import gpdraw.SketchPad;
import gpdraw.DrawingTool;
import java.util.*;

public class P4_evangelista_andrew_FirstHouse {
    
    /*
    Name:       Andrew
    Date:       8/27
    Period:     4th

    Is this lab fully working?  YES
    */
    
    public static void main(String args[]){
        int padWidth = 800;
        int padHeight = 600;
        //intializing object
        SketchPad pad = new SketchPad(padWidth, padHeight);
        DrawingTool pen = new DrawingTool(pad);
        Color customBrown = new Color(151, 123, 75); // RGB values
        Color darkGreen = new Color(3, 155, 29,55);
        Color grassGreen = new Color(31, 131, 24);
        Color windowColor = new Color(91, 242, 247);
        Color roof = new Color(255,182,97);
        
        //declaring variables 
        int widthHouse = 300;
        int heightHouse = widthHouse/2;
        int numberOfLines = 50;  
        int lineHeight = numberOfLines;
        double roofLength = widthHouse * Math.sin(Math.toRadians(30)) / Math.sin(Math.toRadians(120));
        double heightDoor = heightHouse * 0.7;
        double widthDoor = widthHouse * 0.15;
        double heightWindow = heightHouse * 0.6;
        double widthWindow = widthHouse/4; 
        pen.setWidth(5);
        //drawing the base of the house
        pen.up();
        pen.move(0,heightHouse/2);
        pen.down();
        pen.setColor(customBrown);
        pen.drawRect(widthHouse,heightHouse);
        pen.up();
        pen.move(-1*heightHouse,heightHouse/2);
        pen.move(-1*heightHouse,heightHouse);
        
        //drawing the roof of the house 
        pen.down();
        pen.setColor(roof);
        pen.turnRight(60);
        pen.forward(roofLength);
        pen.turnRight(60);
        pen.forward(roofLength);
        pen.turnRight(180);
        pen.forward(roofLength);
        pen.turnLeft(20);
        pen.forward(widthHouse*0.2);
        pen.turnLeft(40);
        pen.forward(roofLength);
        
        //drawing 3d part of roof
        pen.setColor(customBrown);
        pen.turnLeft(140);
        pen.forward(widthHouse * 0.2);
        pen.turnLeft(180);
        pen.forward(widthHouse * 0.2);
        pen.turnLeft(100);
        pen.forward(heightHouse);
        pen.turnLeft(80);
        pen.forward(widthHouse*0.2);
        //drawing door
        pen.setColor(Color.red);
        pen.up();
        pen.turnLeft(10);
        pen.forward(heightHouse);
        pen.turnLeft();
        pen.forward(heightDoor/2);
        pen.down();
        pen.drawRect(widthDoor,heightDoor);
        pen.fillRect(widthDoor, heightDoor);
        //drawing first window
        pen.setColor(Color.blue);
        pen.up();
        pen.turnLeft();
        pen.move(widthHouse * 0.3);
        pen.turnRight();
        pen.move(heightHouse * 0.1);
        pen.down();
        pen.drawRect(widthWindow,heightWindow);
        pen.setColor(windowColor);
        pen.fillRect(widthWindow-1,heightWindow-1);
        //drawing second window
        pen.up();
        pen.turnRight();
        pen.forward(widthHouse * 0.6);
        pen.down();
        pen.setColor(Color.blue);
        pen.drawRect(widthWindow,heightWindow);
        pen.setColor(windowColor);
        pen.fillRect(widthWindow-1,heightWindow-1);
        pen.up();
        pen.turnRight();
        pen.forward(widthHouse * 0.225);
        pen.down();
        //drawing grass
        pen.setColor(darkGreen);
        pen.turnRight(); 
        pen.forward(800); 
        pen.turnRight(180);
        pen.forward(1600);
        pen.up();
        pen.down();
        pen.move(0,-300);
        pen.fillRect(800,600);
        pen.up();
        pen.down();
        pen.setColor(grassGreen);
        pen.up();

        for(int i = 0; i < numberOfLines; i++) {
            double randomX = -padWidth/2 + (Math.random() * padWidth);
            double randomY = -padHeight/2 + (Math.random() * (-50 + padHeight/2)); 

            if(randomY > -50) {
                randomY = -50 - (Math.random() * 50);
            }

            // Set starting position for each line
            pen.up();
            pen.move(randomX, randomY);

            double randomAngle = 10 + (Math.random() * 10); 
            if(Math.random() < 0.5) {
                // half the time, make it leftward
                randomAngle = -randomAngle;
            }

            // Draw the line in the random direction
            pen.down();
            pen.setDirection(90 + randomAngle); 
            pen.forward(lineHeight);
        }
    }

        
}    
