package cube.gui;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;

public class Panel extends JPanel {

    final private static int WIDTH = 600;
    final private static int HEIGHT = 600;

    public Panel() {
        initPanel();
    }

    public void initPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void update() {

    }
    
}
