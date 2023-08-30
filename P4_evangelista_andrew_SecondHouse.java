import java.awt.*;
import gpdraw.SketchPad;
import gpdraw.DrawingTool;
import java.util.*;

public class P4_evangelista_andrew_SecondHouse {
    
    /*
    Name:       Andrew
    Date:       8/29
    Period:     4th

    Is this lab fully working?  YES
    */
        static int padWidth = 800;
        static int padHeight = 600;
        //intializing object
        static SketchPad pad = new SketchPad(padWidth, padHeight);
        static DrawingTool pen = new DrawingTool(pad);
        static Color customBrown = new Color(151, 123, 75); // RGB values
        static Color darkGreen = new Color(3, 155, 29,55);
        static Color grassGreen = new Color(31, 131, 24);
        static Color windowColor = new Color(91, 242, 247);
        static Color roof = new Color(255,182,97);
    
        //declaring variables 
    public static void main(String args[]){
        pen.setWidth(5);
        drawTree(200, 50, 200);
        drawTree(200,50,-400);
        drawHouse(300, -50);
        drawHouse(30,350);
      
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
    //draw grass
        int numberOfLines = 50;  
        int lineHeight = numberOfLines;
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
    //function draw tree
    static void drawTree(int heightTree, int widthTree, int x){
        pen.up();
        pen.move(x,0.5*heightTree);
        pen.setDirection(90);
        pen.down();
        pen.setColor(customBrown);
        pen.turnLeft();
        pen.forward(1/2*widthTree);
        pen.turnLeft();
        pen.forward(1/2*heightTree);
        pen.fillRect(widthTree,heightTree);
        pen.setColor(Color.black);
        pen.drawRect(widthTree,heightTree);
        pen.up();
        pen.move(x-0.5*widthTree, heightTree);
        pen.setDirection(90);
        pen.down();
        pen.setColor(Color.green);
        pen.fillCircle(20);
        pen.turnRight();
        pen.forward(0.5*widthTree);
        pen.fillCircle(20);
        pen.forward(0.5*widthTree);
        pen.fillCircle(20);
        pen.move(x-0.5*widthTree, heightTree);
        pen.setDirection(90);
        pen.forward(30);
        pen.turnLeft();
        pen.forward(20);
        pen.turnRight();
        pen.fillCircle(20);
        pen.turnRight();
        pen.forward(0.5*widthTree);
        pen.fillCircle(20);
        pen.forward(0.5*widthTree);
        pen.fillCircle(20);
        pen.forward(0.5*widthTree);
        pen.fillCircle(20);
        pen.move(x-0.5*widthTree, heightTree+50);
        pen.setDirection(90);
        pen.setColor(Color.green);
        pen.fillCircle(20);
        pen.turnRight();
        pen.forward(0.5*widthTree);
        pen.fillCircle(20);
        pen.forward(0.5*widthTree);
        pen.fillCircle(20);
        pen.up();
    }
    //function draw house
    static void drawHouse(int widthHouse, int x){
        //int widthHouse = 300;
        int heightHouse = widthHouse/2;
        double roofLength = widthHouse * Math.sin(Math.toRadians(30)) / Math.sin(Math.toRadians(120));
        double heightDoor = heightHouse * 0.7;
        double widthDoor = widthHouse * 0.15;
        double heightWindow = heightHouse * 0.6;
        double widthWindow = widthHouse/4; 
          //drawing the base of the house
        pen.up();
        double dir = pen.getDirection();
        pen.move(x,heightHouse/2);
        pen.setDirection(dir);
        pen.down();
        pen.setColor(customBrown);
        pen.drawRect(widthHouse,heightHouse);
        pen.up();
        //pen.forward(200);
        pen.move(-widthHouse/2+x,heightHouse);
        pen.setDirection(90);
        //pen.forward(200);
        
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
    }

        
}    
