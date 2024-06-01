package view;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import java.io.File;
import java.awt.Font;
public class Loader {
    
    private ImageIcon windowIcon;
    private ImageIcon menuBackgroundImage; 
    private ImageIcon selectMenuItem;
    private File menuSound;
    private File selectMenuItemSound;
    private Clip clip; 
    private Font fonts;

    public Loader(){
        try {
            //images
            this.windowIcon = new ImageIcon(getClass().getResource("/res/homeMenu/windowIcon.png"));
            this.menuBackgroundImage = new ImageIcon(getClass().getResource("/res/homeMenu/homeScreenLogo.png"));
            this.selectMenuItem = new ImageIcon(getClass().getResource("/res/homeMenu/selectMenuItem.jpeg"));
            
            
            //Sounds
            this.menuSound = new File(getClass().getResource("/res/sound/into.wav").getFile());
            this.selectMenuItemSound = new File(getClass().getResource("/res/sound/shoot.wav").getFile());

            //Font
            // this.fonts = Font.createFont(Font.TRUETYPE_FONT, new File(getClass().getResource("/fonts/megaman.ttf").getFile())).deriveFont(28f);
            this.fonts = Font.createFont(
                Font.TRUETYPE_FONT,
                getClass().getResourceAsStream("/res/fonts/optionTwo.ttf")
            ).deriveFont(18f);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Unable to load textures");
        }
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

    public Font getFont(){
        return this.fonts;
    }
}
