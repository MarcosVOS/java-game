package game;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setBackground(Color.BLACK);
        

        //===Align vertically at the top and center horizontally
        // JLabel backgroundLabel = new JLabel(assetLoader.getMenuBackgroundImage());
        // backgroundLabel.setHorizontalAlignment(JLabel.CENTER); 
        // backgroundLabel.setVerticalAlignment(JLabel.TOP); 
        // window.setContentPane(backgroundLabel);
        
        //===Centers on screen
        JLabel backgroundLabel = new JLabel(assetLoader.getMenuBackgroundImage());
        backgroundLabel.setBounds(0, 0, WIDTH, HEIGHT);
        window.setContentPane(backgroundLabel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
