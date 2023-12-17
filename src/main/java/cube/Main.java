package cube;

import cube.cubeStuff.Cube;
import cube.gui.GraphicsManager;

public class Main {
    public static GraphicsManager gManager;

    public static void main(String[] args) {
        gManager = new GraphicsManager();

        Cube c = new Cube(10);

        System.out.println(c);
    }
}