import gpdraw.*;
public class P4_Evangelista_Andrew_KochCurveDriver{
    public static void main (String[] args){
        P4_Evangelista_Andrew_KochCurve kochCurve = new P4_Evangelista_Andrew_KochCurve();
        kochCurve.pen.turnLeft(30);
        //kochCurve.drawKochSnowflake(5,300);
        kochCurve.drawKochAntiSnowflake(5,300);
    }
}