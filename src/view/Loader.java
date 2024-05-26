package view;

import javax.swing.ImageIcon;

public class Loader {
    private ImageIcon windowIcon;

    public Loader(){
        this.windowIcon = new ImageIcon(getClass().getResource("/assets/windowIcon.png"));
    }

    public ImageIcon getWindowIcon(){
        return this.windowIcon;
    }
}
