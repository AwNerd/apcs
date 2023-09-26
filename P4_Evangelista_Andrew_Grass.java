import java.awt.*;
import gpdraw.*;

/**
 * Class that provides functionality to draw grass on a given SketchPad.
 * 
 * <p><b>Example Usage:</b></p>
 * <pre>
 *     SketchPad pad = new SketchPad(800, 600);
 *     P4_Evangelista_Andrew_Grass grassDrawer = new P4_Evangelista_Andrew_Grass(pad);
 *     grassDrawer.draw();
 * </pre>
 */
public class P4_Evangelista_Andrew_Grass {

    private final DrawingTool pen;
    private final int padWidth;
    private final int padHeight;
    private final Color darkGreen = new Color(3, 155, 29, 55);
    private final Color grassGreen = new Color(31, 131, 24);

    /**
     * Constructor that initializes theP4_Evangelista_Andrew_Grass object to draw grass on the specified SketchPad.
     * 
     * @param pad The SketchPad canvas where the grass will be drawn. This should be non-null.
     */
    public P4_Evangelista_Andrew_Grass(SketchPad pad) {
        this.padWidth = pad.getWidth();
        this.padHeight = pad.getHeight();
        this.pen = new DrawingTool(pad);

    }

    /**
     * Public method to draw the grass on the specified SketchPad. This includes the base layer and individual grass blades.
     */
    public void draw() {
        drawBaseGrass();
        drawGrassBlades();
    }

    private void drawBaseGrass() { 
        pen.move(0, 0);
        pen.setDirection(90);
        pen.setColor(darkGreen);
        pen.turnRight();
        pen.forward(padWidth);
        pen.turnRight(180);
        pen.forward(2 * padWidth);
        pen.up();
        pen.down();
        pen.move(0, -390);
        pen.fillRect(padWidth, padHeight);
        pen.up();
        pen.setColor(grassGreen);
        pen.up();
    }

    private void drawGrassBlades() { //draws the grass blades of the grass randomly 
        int numberOfLines = 50;
        for (int i = 0; i < numberOfLines; i++) {
            double randomX = -padWidth / 2.0 + (Math.random() * padWidth);
            double randomY = -padHeight / 2.0 + (Math.random() * (-50 + padHeight / 2.0));
            randomY = randomY > -50 ? -50 - (Math.random() * 50) : randomY;

            pen.up();
            pen.move(randomX, randomY);

            double randomAngle = 10 + (Math.random() * 10);
            if (Math.random() < 0.5) {
                randomAngle = -randomAngle;
            }

            pen.down();
            pen.setDirection(90 + randomAngle);
            pen.forward(numberOfLines);
        }
    }
}
