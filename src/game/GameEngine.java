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
        
        InitailMenu mainMenu = new InitailMenu(this);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public int getWidth(){
        return this.WIDTH;
    } 

    public int getHeigth(){
        return this.HEIGHT;
    }
    
    public JFrame getWindow(){
        return this.window;
    }

    public Loader getLoader(){
        return this.assetLoader;
    }
}
