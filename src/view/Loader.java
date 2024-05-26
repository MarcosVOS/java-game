package view;

import javax.swing.ImageIcon;

public class Loader {
    private ImageIcon windowIcon;
    private ImageIcon menuBackgroundImage; 

    public Loader(){
        this.windowIcon = new ImageIcon(getClass().getResource("/assets/windowIcon.png"));
        this.menuBackgroundImage = new ImageIcon(getClass().getResource("/assets/homeScreenLogo.png"));
    }

    public ImageIcon getWindowIcon(){
        return this.windowIcon;
    }

    public ImageIcon getMenuBackgroundImage(){
        return this.menuBackgroundImage;
    }
}
