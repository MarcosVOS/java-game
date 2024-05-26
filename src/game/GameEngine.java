package game;

import javax.swing.JFrame;
import view.Loader;

public class GameEngine {
    private final int WIDTH = 1280;
    private final int HEIGHT = 720; 
    private final String gameName = "Megaman X1";
    private JFrame window;
    private Loader assetLoader;

    public GameEngine(){

        assetLoader = new Loader();

        window = new JFrame(gameName);
        window.setIconImage(assetLoader.getWindowIcon().getImage());
        window.setSize(WIDTH,HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null); 
        window.setResizable(false);

        window.setVisible(true);
    }
}
