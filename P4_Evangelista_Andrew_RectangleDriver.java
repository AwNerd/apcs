import gpdraw.*;
public class P4_Evangelista_Andrew_RectangleDriver{
    public static void main (String[] args){
        SketchPad pad = new SketchPad(200,200);
        Rectangle rect1 = new Rectangle(-50,-50,66,100,pad);
        Rectangle rect2 = new Rectangle(-17,-50,66,100,pad);
        Rectangle rect3 = new Rectangle(-50,-17,100,33,pad);
        
        rect1.draw();
        rect2.draw();
        rect3.draw();
        System.out.println("Perimeter: "+  rect1.calcPerimeter() +  " Area: " + rect1.calcArea()); 
        System.out.println("Perimeter: "+  rect2.calcPerimeter() +  " Area: " + rect2.calcArea()); 
        System.out.println("Perimeter: "+  rect3.calcPerimeter() +  " Area: " + rect3.calcArea()); 
    }
}