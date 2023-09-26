import gpdraw.*;
import java.awt.*;
/*
    Name:       Andrew
    Date:       9/17
    Period:     4

    Is this lab fully working?  Yes
*/
/**
 * Write a description of class P4_Evangelista_Andrew_Illusion here.
 *
 * This class describes a optical illusion using helper methods.
 */
public class P4_Evangelista_Andrew_Illusion{
    /** 
     * This method draws a square
     * @param size size of the square
     * @param color color of the square
     * @param x x position of the square
     * @param y y position of the square
     * @param pen drawingtool used to draw square
     */
    public static void drawSquare(int size, Color color, int x, int y, DrawingTool pen){
        pen.setWidth(1);
        pen.setColor(color);
        pen.move(x+size/2, y+size/2);
        pen.down();
        pen.fillRect(size, size);   
        pen.up();
    }
    
    /**
     * this method draws a line 
     * @param size size of the square used to correlate to thickness of line
     * @param x x value of line
     * @param y y value pos of line
     * @param length length of the line
     * @param pen drawing tool used to draw
       */
    
    public static void drawLine(int size, int x, int y, int length, DrawingTool pen){
        pen.setWidth(size/5);
        pen.move(x, y);
        pen.setDirection(0);
        pen.down();
        pen.forward(length);
        pen.up();
    }
    
    /** 
     * this method draws a column of black and white alternating squares
     * @param num num of squares
     * @param size size of the square
     * @param x x value of starting left center square
     * @param y value of starting left center square
     * @param pen drawingtool used to draw
       */
    public static void drawColumn(int num, int size, int x, int y, DrawingTool pen){
        for(int i = 0; i<num; i++){
            if(i%2 == 0){
                drawSquare(size, Color.white, x+(i*size), y, pen);
            } else {
                drawSquare(size, Color.black, x+(i*size), y, pen);
            }
            drawLine(size ,x,(y-1), (num*size), pen);
        }
    }
    
    /** 
    * this method draws the entire illusion
    * @param numColumns number of columns
    * @param numSquareColumn number of squares in a column
    * @param size size of square
    * @param x starting pos of top left center of square
    * @param y starting pos of y value of top left center square
    * @param offset offset you want square to move
    * @param pen Drawing tool used to draw 
    */
    public static void draw(int numColumns, int numSquareColumn, int size, int x, int y, int offset, DrawingTool pen){
        for(int i = 0; i < numColumns; i++){
            if(i%2== 0){
                drawColumn(numSquareColumn, size, x+offset, y-(i*size), pen);
            } else {
                drawColumn(numSquareColumn, size, x, y-(i*size), pen);
            }
        }
    }
    
}
