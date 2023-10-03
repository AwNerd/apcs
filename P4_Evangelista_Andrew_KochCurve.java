import gpdraw.*;
/*
   Date 10/2
   Name Andrew Evangelista
   Does this lab work YESSS :3
   */
public class P4_Evangelista_Andrew_KochCurve {
    SketchPad pad = new SketchPad(500, 500);
    public DrawingTool pen = new DrawingTool(pad);
    public void drawKochCurve(int level, int length) {
        pen.down();
        if (level < 1) {
            pen.forward(length);
        } else {
            drawKochCurve(level - 1, length / 3);
            pen.turnLeft(60);
            drawKochCurve(level - 1, length / 3);
            pen.turnRight(120);
            drawKochCurve(level - 1, length / 3);
            pen.turnLeft(60);
            drawKochCurve(level - 1, length / 3);
        }   
    }
    public void drawKochSnowflake(int level, int length) {
        for(int i = 0; i < 3; i++) {
            drawKochCurve(level, length);   
            pen.turnRight(120);
        }
    }
    public void drawKochAntiSnowflake(int level, int length) {
        for(int i = 0; i < 3; i++) {
            drawKochCurve(level, length);
            pen.turnLeft(120);
        }
    }
}
