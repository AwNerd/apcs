import java.awt.*;
import gpdraw.SketchPad;
import gpdraw.DrawingTool;
import period_4_houseparts.*;
import java.util.Random;

/**
 * Name: Andrew Evangelista
 * Date: 9/14
 * Period: 4th
 */
public class P4_Evangelista_Andrew_CoolHouse {

    private static int pad_width = 2000;
    private static int pad_height = 800;
    private static SketchPad pad = new SketchPad(pad_width, pad_height, 0);
    private static DrawingTool pen = new DrawingTool(pad);

    public static void main(String[] args) {
        // Setup
        P4_Evangelista_Andrew_Grass grass = new P4_Evangelista_Andrew_Grass(pad);
        P4_Evangelista_Andrew_House house = new P4_Evangelista_Andrew_House(300, -50, 0, pad);
        P4_Evangelista_Andrew_Tree tree = new P4_Evangelista_Andrew_Tree(pad, 100, 0);
        P4_Balu_Kartik_Sun sun = new P4_Balu_Kartik_Sun(-100, 300, pad, 50, 50);
        P4_Pan_Isaac_BrickHouse brickHouse = new P4_Pan_Isaac_BrickHouse(-500, 100, pad);
        P4_Joshi_Dishita_Flower YellowFlower = new P4_Joshi_Dishita_Flower(Color.YELLOW, Color.RED, 12, 10, pad); 
        P4_Kothari_Anshi_Sun sun1 = new P4_Kothari_Anshi_Sun(0, 0, pad);
        P4_Lee_Claire_HatMan exampleMan = new P4_Lee_Claire_HatMan(350, 100, 500, pad);
        Color skinColor = new Color(245, 179, 174);
        P4_Sujith_Navaneeth_Human human = new P4_Sujith_Navaneeth_Human(pad, -400, 100);
        p4_gu_cheryl_tree tree1 = new p4_gu_cheryl_tree(pad);
        Random rand = new Random();

        // Setting properties
        setupExampleManProperties(exampleMan);
        setupSun1Properties(sun1);
        brickHouse.setDoorColor(Color.BLUE);
        pen.setWidth(5);
        tree.setPos(100, 0);
        human.bioPartsColorChooser(Color.BLACK, skinColor, Color.GRAY, Color.BLACK);

        // Drawing
        drawRandomTrees(tree1, rand);
        brickHouse.draw();
        tree.drawTree(100, 20);
        house.draw(300, 500, 0, pad);
        grass.draw();
        sun.draw();
        human.draw();
        YellowFlower.Draw(Color.YELLOW, Color.RED, 20, 10, pad);
        exampleMan.draw();
    }

    private static void setupExampleManProperties(P4_Lee_Claire_HatMan exampleMan) {
        exampleMan.setShirtColor(Color.BLUE);
        exampleMan.setLegColor(Color.RED);
        exampleMan.setHatColor(Color.GREEN);
        exampleMan.setPenWidth(3);
        exampleMan.setHeadColor(Color.RED);
    }

    private static void setupSun1Properties(P4_Kothari_Anshi_Sun sun1) {
        sun1.setSunRadius(26);
        sun1.setRayWidth(5);
        sun1.setRayLength(66);
        sun1.setNumberRays(12);
        sun1.setPosition(400, 300);
        sun1.setSunColor(Color.GREEN);
        sun1.draw();
    }

    private static void drawRandomTrees(p4_gu_cheryl_tree tree1, Random rand) {
        for(int i = 0; i < 10; i++) {
            int randomX = rand.nextInt(401) - 200; // Random number between -200 and 200
            tree1.setPosition(randomX, 125);
            tree1.setLeafSize(50);
            tree1.draw();
        }
    }
}
