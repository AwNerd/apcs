import gpdraw.*;

/**
 * The P4_Evangelista_Andrew_Tree class provides methods to draw a fractal tree using the gpdraw API.
 * This class offers flexibility in controlling the starting position, branch length, and depth of recursion for the tree.
 * 
 * Example usage:
 * <pre>
 * P4_Evangelista_Andrew_Tree tree = new P4_Evangelista_Andrew_Tree(pad, 100,0);
   tree.setPos(100, 0);
   tree.drawTree(50,5);
 * </pre>
 */
public class P4_Evangelista_Andrew_Tree {

    /** X-coordinate for the base of the tree. */
    private double startX;

    /** Y-coordinate for the base of the tree. */
    private double startY;

    /** SketchPad instance for drawing. */
    private SketchPad pad;

    /**
     * Constructs a new fractal tree instance with a specified starting position.
     *
     * @param pad     the SketchPad to draw on
     * @param startX  the x-coordinate for the base of the tree
     * @param startY  the y-coordinate for the base of the tree
     */
    public P4_Evangelista_Andrew_Tree(SketchPad pad, double startX, double startY) {
        this.pad = pad;
        this.startX = startX;
        this.startY = startY;
    }

    /**
     * Constructs a new fractal tree instance with a default starting position (centered at the bottom).
     *
     * @param pad the SketchPad to draw on
     */
    public P4_Evangelista_Andrew_Tree(SketchPad pad) {
        this(pad, 0, -250);
    }

    /**
     * Sets the starting position for the base of the tree.
     * 
     * @param x the x-coordinate for the base of the tree
     * @param y the y-coordinate for the base of the tree
     * @return the current tree instance for chaining
     */
    public P4_Evangelista_Andrew_Tree setPos(double x, double y) {
        this.startX = x;
        this.startY = y;
        return this; 
    }

    /**
     * Draws the fractal tree based on the provided branch length and depth of recursion.
     * 
     * @param branchLength initial length of the tree's main branch
     * @param depth number of recursive steps for the tree drawing
     */
    public void drawTree(double branchLength, int depth) {
        DrawingTool pen = new DrawingTool(pad);

        pen.up();
        pen.move(startX, startY);
        pen.down();
        pen.setColor(java.awt.Color.BLACK);
        pen.setDirection(90);
        draw(branchLength, depth, pen);
    }

    /**
     * Recursive method to draw the branches of the tree.
     * 
     * @param branchLength current branch's length
     * @param depth current depth of recursion
     * @param pen the DrawingTool instance used for drawing
     */
    private void draw(double branchLength, int depth, DrawingTool pen) {
        if (depth == 0 || branchLength < 10) {
            return;
        } else {
            pen.forward(branchLength);
            pen.turnLeft(30);
            draw(branchLength * 0.67, depth - 1, pen);
            pen.turnRight(60);
            draw(branchLength * 0.67, depth - 1, pen);
            pen.turnLeft(30);
            pen.backward(branchLength);
        }
    }
}
