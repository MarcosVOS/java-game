package view;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;

public class Loader {
    
    private ImageIcon windowIcon;
    private ImageIcon menuBackgroundImage; 
    private ImageIcon selectMenuItem;
    private File menuSound;
    private File selectMenuItemSound;
    private Clip clip; 

    public Loader(){

        //images
        this.windowIcon = new ImageIcon(getClass().getResource("/assets/windowIcon.png"));
        this.menuBackgroundImage = new ImageIcon(getClass().getResource("/assets/homeScreenLogo.png"));
        this.selectMenuItem = new ImageIcon(getClass().getResource("/assets/selectMenuItem.jpeg"));
        
        
        //Sounds
        this.menuSound = new File(getClass().getResource("/sound/into.wav").getFile());
        this.selectMenuItemSound = new File(getClass().getResource("/sound/shoot.wav").getFile());

    }

    public void playSound(File sound) {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(sound);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
           System.out.println(e);
        }
        return;
    }

    public void stopSound(){
        if(clip != null){
            clip.stop();
            clip.close();
        }
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

    public File getMenuSound(){
        return this.menuSound;
    }

    public File getSelectMenuItemSound(){
        return this.selectMenuItemSound;
    }
}
