package cube.gui;

public class GraphicsManager implements Runnable {

    Panel panel = new Panel();
    Window window = new Window();
    
    public GraphicsManager() {
        initGM();
    }

    public void initGM() {
        window.add(panel);
        window.pack();
        window.setVisible(true);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
