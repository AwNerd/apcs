import gpdraw.*;
import java.awt.*;

/**
 * This class represents a basic 3D-ish house visual representation. The house's
 * dimensions and position can be controlled, and it's rendered on a provided SketchPad.
 * 
 * <p>Example Usage:</p>
 * <pre>
 *     P4_Evangelista_Andrew_House house = new P4_Evangelista_Andrew_House(300, -50, 0, pad);
 *     house.draw(300, -50, 0, pad);
 *     house.draw(30, 350, 100, pad);
 * </pre>
 * 
 * @author Andrew Evangelista
 * @version 1.0
 * @since 9/4
 */
public class P4_Evangelista_Andrew_House {

    /** The width of the house in pixels. */
    private int width;

    /** The X position (center) of the house. */
    private int x;

    /** The Y position (bottom) of the house. */
    private int y;

    /** The SketchPad used to draw the house. */
    private SketchPad pad;

    /**
     * Constructs a new house with the provided dimensions and position.
     * 
     * @param width The width of the house in pixels.
     * @param x The horizontal position (center) of the house.
     * @param y The vertical position (bottom) of the house.
     * @param pad The SketchPad to draw the house on.
     */
    public P4_Evangelista_Andrew_House(int width, int x, int y, SketchPad pad) {
        this.width = 200;
        this.x = x;
        this.y = y;
        this.pad = pad;
    }

    /**
     * Sets the width of the house.
     * 
     * @param widthHouse The desired width in pixels.
     */
    public void setWidth(int widthHouse) {
        this.width = widthHouse;
    }

    /**
     * Draws the house with the specified dimensions and position on the provided SketchPad.
     * 
     * @param width The width of the house in pixels.
     * @param x The horizontal position (center) of the house.
     * @param y The vertical position (bottom) of the house.
     * @param pad The SketchPad to draw the house on.
     */
    public void draw(int width, int x, int y, SketchPad pad) {
        Color customBrown = new Color(151, 123, 75); // RGB values
        Color roof = new Color(255,182,97);
        Color windowColor = new Color(91, 242, 247);
        DrawingTool pen = new DrawingTool(pad);
        int heightHouse = width/2;
        double roofLength = width * Math.sin(Math.toRadians(30)) / Math.sin(Math.toRadians(120));
        double heightDoor = heightHouse * 0.7;
        double widthDoor = width * 0.15;
        double heightWindow = heightHouse * 0.6;
        double widthWindow = width/4; 
        
        //drawing the base of the house
        pen.up();
        double dir = pen.getDirection();
        pen.move(x,y);
        pen.move(x,heightHouse/2+y);
        pen.setDirection(dir);
        pen.down();
        pen.setColor(customBrown);
        pen.drawRect(width,heightHouse);
        pen.up();
        pen.move(-width/2+x,heightHouse+y);
        pen.setDirection(90);
        
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
        pen.forward(width*0.2);
        pen.turnLeft(40);
        pen.forward(roofLength);
        
        //drawing 3d part of roof
        pen.setColor(customBrown);
        pen.turnLeft(140);
        pen.forward(width * 0.2);
        pen.turnLeft(180);
        pen.forward(width * 0.2);
        pen.turnLeft(100);
        pen.forward(heightHouse);
        pen.turnLeft(80);
        pen.forward(width*0.2);
        
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
        pen.move(width * 0.3);
        pen.turnRight();
        pen.move(heightHouse * 0.1);
        pen.down();
        pen.drawRect(widthWindow,heightWindow);
        pen.setColor(windowColor);
        pen.fillRect(widthWindow-1,heightWindow-1);
        
        //drawing second window
        pen.up();
        pen.turnRight();
        pen.forward(width * 0.6);
        pen.down();
        pen.setColor(Color.blue);
        pen.drawRect(widthWindow,heightWindow);
        pen.setColor(windowColor);
        pen.fillRect(widthWindow-1,heightWindow-1);
        
        pen.up();
        pen.turnRight();
        pen.forward(width * 0.225);
        pen.down();
    }
}
