package game;

import javax.swing.JFrame;

public class GameEngine {
    private final int WIDTH = 1280;
    private final int HEIGHT = 720; 
    private final String gameName = "Megaman X1";
    private JFrame window;

    public GameEngine(){
        window = new JFrame(gameName);
        window.setSize(WIDTH,HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null); 
        window.setResizable(false);

        window.setVisible(true);

    }
}
