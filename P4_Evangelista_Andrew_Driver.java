import gpdraw.*;
import java.awt.*;
/*
    Name:       Andrew
    Date:       9/17
    Period:     4

    Is this lab fully working?  Yes
*/

public class P4_Evangelista_Andrew_Driver {
    public static void main(String[] args) {
        SketchPad pad = new SketchPad(1000,1000,0);
        SketchPad newpad = new SketchPad(700, 700, 0);
        DrawingTool pen2 = new DrawingTool(newpad);
        DrawingTool pen = new DrawingTool(pad);
        P4_Evangelista_Andrew_Illusion illusion = new P4_Evangelista_Andrew_Illusion();
        illusion.draw(20, 20, 50, -520, 500, 10, pen);
        illusion.draw(10, 10, 20, -350, 350, 5, pen2);
    }
}
