import gpdraw.*;
import java.awt.*;

/*
    Name:       Andrew
    Date:       9/10
    Period:     4

    Is this lab fully working?  Yes
*/


public class P4_Evangelista_Andrew_Sphere {
    // Attributes
    double radius;
    SketchPad pad;
    int x, y;

    // Default Constructor
    public P4_Evangelista_Andrew_Sphere() {
        radius = 200; // Setting a default value
        pad = new SketchPad(500, 500); // Default size
    }

    // Non-default Constructor
    public P4_Evangelista_Andrew_Sphere(double radius, SketchPad pad) {
        this.radius = radius; 
        this.pad = pad;
    }

    //Getter method
    public static void getVolume(int radius){
        System.out.println(4.0/3.0 * Math.PI * Math.pow(radius, 3));
    }

    //Setter method
    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setPos(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void draw(SketchPad pad){
        DrawingTool pen = new DrawingTool(pad);
        pen.up();
        pen.move(x,y);
        double iterations = (0.5 * radius);
        for (int i = 0; i < iterations ; i++) {
            double redIncrement = 248.0 / (iterations-1);
            double greenIncrement = 219.0 / (iterations-1);
            Color customBlue = new Color( (int) Math.round(2 + (i * redIncrement)), (int) Math.round(31 + (i * greenIncrement)), 250);
            int moveIncrement = 1 * i;
            double circleSize = radius - (moveIncrement) - (Math.sqrt(2) * i);
            pen.setColor(customBlue);
            if (i != 0) {
                pen.up();
                pen.move(moveIncrement+x, moveIncrement+y);
            }
            pen.down();
            pen.fillCircle(circleSize);
        }
        pen.up();
    }
}
