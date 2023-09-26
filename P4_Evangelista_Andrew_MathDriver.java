import java.awt.Point;
public class P4_Evangelista_Andrew_MathDriver{
    public static void main (String[] args){
        Point point1 = new Point(1,2);
        Point point2 = new Point(3,4);
        Point point3 = new Point(5,1);
        System.out.println("212\u00B0F --> " + P4_Evangelista_Andrew_Math.fToC(212) + "\u00B0C");
        System.out.println("98.6\u00B0F --> " + P4_Evangelista_Andrew_Math.fToC(98.6) + "\u00B0C");
        System.out.println("37\u00B0F --> " + P4_Evangelista_Andrew_Math.cToF(37) + "\u00B0C");
        System.out.println("-15\u00B0F --> " + P4_Evangelista_Andrew_Math.cToF(-15) + "\u00B0C");
        System.out.println("Volume of a sphere with radius 1.0 is " + P4_Evangelista_Andrew_Math.sphereVolume(1.0));
        System.out.println("Volume of a sphere with radius 6.8 is " + P4_Evangelista_Andrew_Math.sphereVolume(6.8));
        System.out.println("A right triangle with sides 3 and 4 has hypotenuse " +  P4_Evangelista_Andrew_Math.hypotenuse(3,4));
        System.out.println("A right triangle with sides 2.5 and 9.25 has hypotenuse " +  P4_Evangelista_Andrew_Math.hypotenuse(2.5,9.25));
        System.out.println("0.75g of \"Fe\" contains " + P4_Evangelista_Andrew_Math.gramsToAtoms(55.85,0.75));
        System.out.println("5.24g of \"Au\" contains " + P4_Evangelista_Andrew_Math.gramsToAtoms(196.7,5.24));
        System.out.println("2.0g of \"Ne\" contains " + P4_Evangelista_Andrew_Math.gramsToAtoms(20.18,2.0));
        for(int i = 0; i < 6; i++){
            System.out.println("A random number between 7 and 9 is: " + P4_Evangelista_Andrew_Math.randomNum(7,9));
        }
        System.out.println("A triangle with the verticies: " + "\n\t" + point1.toString() + "\n\t" + point2.toString() + "\n\t" + point3.toString() + 
        "has perimeter " + P4_Evangelista_Andrew_Math.perimeter(point1,point2,point3));
    }
}