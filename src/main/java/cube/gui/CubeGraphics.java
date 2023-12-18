package cube.gui;

import java.awt.Color;
import java.awt.Graphics;

import cube.cubeStuff.Cube;
import cube.cubeStuff.Point;

public class CubeGraphics {

    public CubeGraphics(int size) {
        cube = new Cube(size);
        System.out.println(cube);
    }

    Cube cube;
    int offset = 300;
    
    public void draw(Graphics g) {
        
        // 1 - 4 connect
        // 5 - 8 connect
        // n - n+4 connect

        
        Point p1;
        Point p2;
        
        g.setColor(Color.white);

        

        for (int i = 0; i < 2; i++) {
            p1 = cube.getPoint(i);
            p2 = cube.getPoint(i+2);
            line(g, p1, p2);

            
            

            p1 = cube.getPoint(i+4);
            p2 = cube.getPoint(i+6);
            line(g, p1, p2);
        }


        for (int i = 0; i < 4; i+=2) {
            p1 = cube.getPoint(i);
            p2 = cube.getPoint(i+1);
            line(g, p1, p2);

            p1 = cube.getPoint(i+4);
            p2 = cube.getPoint(i+5);
            line(g, p1, p2);
        }


        for (int i = 0; i < 4; i++) {
            p1 = cube.getPoint(i);
            p2 = cube.getPoint(i + 4);
            line(g, p1, p2);
        }
        
        

        //g.drawLine(0, 0, 600, 600);
    }

    public void line(Graphics g, Point p1, Point p2) {
        g.drawLine((int) (p1.x) + offset, (int) (p1.y) + offset, (int) (p2.x) + offset, (int) (p2.y) + offset);
    }
}
