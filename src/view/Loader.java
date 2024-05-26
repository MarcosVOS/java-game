package view;

import javax.swing.ImageIcon;

public class Loader {
    
    private ImageIcon windowIcon;
    private ImageIcon menuBackgroundImage; 
    private ImageIcon selectMenuItem;

    public Loader(){

        this.windowIcon = new ImageIcon(getClass().getResource("/assets/windowIcon.png"));
        this.menuBackgroundImage = new ImageIcon(getClass().getResource("/assets/homeScreenLogo.png"));
        this.selectMenuItem = new ImageIcon(getClass().getResource("/assets/selectMenuItem.jpeg"));
    }

    public ImageIcon getWindowIcon(){
        return this.windowIcon;
    }

    public ImageIcon getMenuBackgroundImage(){
        return this.menuBackgroundImage;
    }

    public ImageIcon getSelectMenuItem(){
        return this.selectMenuItem;
    }
}
