import java.math.*;
import java.awt.Point;
import java.awt.geom.Point2D;

/** 
 * This class is a math class that does cool stuff
 * @author Andrew
*/
public class P4_Evangelista_Andrew_Math {  
    private static double AVAGADROS = 6.022140857e23;
    /** 
     * This method converts celsius to farenheit
     * @return double
     * @param celsius temperature in celsius
    */
    public static double cToF(double celsius){
        return (double)((celsius*9/5)+32);        
    }
    /** 
     * This method converts farenheit to celsius
     * @return double
     * @param farenheit temperature in farenheit
    */
    public static double fToC(double farenheit){
        return (((double)5/9)*(farenheit-32));
    }
    /** 
     * This method takes in a radius value for a sphere and returns it's volume.
     * @return double
     * @param radius radius of the sphere
    */
    public static double sphereVolume(double radius){
        return (Math.PI* ((double)4/3)*Math.pow(radius,3));
    }
    /** 
     * This method takes in two sides of a triangle and returns the hypotenuse of a right triangle using pythagoreans therom.
     * @return double
     * @param side1 length of the first side of the triangle
     * @param side2 length of the second side of the triangle
    */
    public static double hypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }
    /** 
     * This method returns the atoms present given the atomic mass and grams of a substance
     * @return double
     * @param atomicMass atomic mass of element
     * @param grams amount of grams of given element
    */
    public static double gramsToAtoms(double atomicMass, double grams){
        return (grams/atomicMass)*AVAGADROS;
    }
    /** 
     * This method accepts two integers a, b and returns a random integet between a and b, endpoints inclusive
     * @return int
     * @param a minimum range
     * @param b maximum range
    */
    public static int randomNum(int a, int b){
        return (int)(Math.random() * (b-a+1)) + a;
    }
    /** 
     * This method returns the perimiter of a triangle given its three veritices as Point objects.
     * @return double
     * @param point1 first vertex of triangle
     * @param point2 second vertex of triangle
     * @param point3 third vertex of triangle 
    */
    public static double perimeter(Point point1, Point point2, Point point3){
        double x1 = point1.getX();
        double x2 = point2.getX();
        double x3 = point3.getX();
        double y1 = point1.getY();
        double y2 = point2.getY();
        double y3 = point3.getY();
        double perimeter = Point.distance(x1,y1,x2,y2) + Point.distance(x2,y2,x3,y3) + Point.distance(x1,y1,x3,y3);
        return perimeter;
    }
}