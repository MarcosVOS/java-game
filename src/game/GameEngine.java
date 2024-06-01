package game;

import javax.swing.JFrame;
import view.Loader;

public class GameEngine {
    private final int WIDTH = 1280;
    private final int HEIGHT = 720; 
    private final String GAME_NAME = "Megaman X1";

    private JFrame window;
    private Loader assetLoader;

    public GameEngine(){
        assetLoader = new Loader();
        setupWindow();
        showInitialMenu();
    }

    public void setupWindow(){
        window = new JFrame(GAME_NAME);
        window.setIconImage(assetLoader.getWindowIcon().getImage());
        window.setSize(WIDTH,HEIGHT);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public int getWidth(){
        return this.WIDTH;
    } 

    public int getHeight(){
        return this.HEIGHT;
    }
    
    public JFrame getWindow(){
        return this.window;
    }

    public Loader getLoader(){
        return this.assetLoader;
    }

    public void showInitialMenu(){
        HomeMenu mainMenu = new HomeMenu(this);
        window.setContentPane(mainMenu);
        window.revalidate();
    }

    public void showLeve1(){
        LevelOne levelOne = new LevelOne();
        window.setContentPane(levelOne); 
        window.revalidate();
    }
}
