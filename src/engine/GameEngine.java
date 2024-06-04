package engine;

import javax.swing.JFrame;
import util.Loader;

public class GameEngine {
    private final int WIDTH = 1280;
    private final int HEIGHT = 720; 
    private final String GAME_NAME = "Megaman X1";

    private JFrame window;
    private Loader assetLoader;

    public enum CurrentStage {
        MAIN_MENU,
        LEVEL_ONE
    }

    public GameEngine(){
        assetLoader = new Loader();
        setupWindow();
        setStage(CurrentStage.MAIN_MENU);
    }

    public void setStage(CurrentStage stage){
        switch (stage) {
            case MAIN_MENU:
                showInitialMenu();
                break;
            case LEVEL_ONE:
                showLeveOne();
                break;
            default:
                break;
        }
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

    public void showLeveOne(){
        LevelOne levelOne = new LevelOne(this);
        window.setContentPane(levelOne); 
        window.revalidate();
    }
}
