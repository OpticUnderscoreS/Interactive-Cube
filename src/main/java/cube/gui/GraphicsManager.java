package cube.gui;

public class GraphicsManager implements Runnable {

    Panel panel = new Panel();
    Window window = new Window();
    
    Thread thread;

    public GraphicsManager() {
        initGM();
    }

    public void initGM() {
        window.add(panel);
        window.pack();
        window.setVisible(true);

        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000/60;
        double nextDrawTime = System.nanoTime() + drawInterval;
        
        while (thread != null) {

            // UPDATE
            

            // PAINT
            panel.repaint();

            try {

                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime /= 1000000;

                if (remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;
                

            } catch (InterruptedException e) {}

        }
    }

}
