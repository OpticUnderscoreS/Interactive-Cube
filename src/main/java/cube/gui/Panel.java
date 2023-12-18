package cube.gui;

import javax.swing.JPanel;

import cube.cubeStuff.Cube;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Panel extends JPanel {

    final private static int WIDTH = 600;
    final private static int HEIGHT = 600;

    CubeGraphics cGraphics = new CubeGraphics(200);
    CubeGraphics c = new CubeGraphics(200);

    public Panel() {
        initPanel();
    }

    public void initPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        cGraphics.draw(g);
        //c.draw(g);
        cGraphics.cube.rotate(Cube.ROTATE_X, -0.01f);

        
    }

    public void update() {

    }
    
}
