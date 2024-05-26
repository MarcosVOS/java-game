package game;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Image;

public class InitailMenu extends JPanel implements KeyListener {
    private GameEngine gameEngine;

    public InitailMenu(GameEngine gameEngine){
        this.gameEngine = gameEngine;
        
        setLayout(null);
        setBackground(Color.BLACK);

        JLabel startGameLabel = createLabel(
            "Começar",
            gameEngine.getWidth(),
            gameEngine.getHeight()+400
        );
        add(startGameLabel);

        JLabel endGameLabel = createLabel(
            "Sair",
            gameEngine.getWidth(),
            gameEngine.getHeight()+400
        );
        add(endGameLabel);

        JLabel selectMenuItem = new JLabel();
        selectMenuItem.setIcon(gameEngine.getLoader().getSelectMenuItem());
        selectMenuItem.setBounds(
            gameEngine.getWidth()/3, 
            gameEngine.getHeight()-selectMenuItem.getPreferredSize().height-90,
            selectMenuItem.getPreferredSize().width, 
            selectMenuItem.getPreferredSize().height
        );

        add(selectMenuItem);
        
    }

    private JLabel createLabel(String text, int width , int height){
        int marginBottom = text == "Sair" ? 40 : 0;
        
        JLabel label = new JLabel(text);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        int labelEndWidth = label.getPreferredSize().width;
        int labelEndHeight = label.getPreferredSize().height;
        label.setBounds((width - labelEndWidth) / 2, (height / 2) + marginBottom, labelEndWidth, labelEndHeight);
        return label;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Image backgroundImage = gameEngine.getLoader().getMenuBackgroundImage().getImage();
        int width = getWidth();
        int height = getHeight();

        int drawWidth = Math.min(width, backgroundImage.getWidth(this));
        int drawHeight = (int) ((float) drawWidth / backgroundImage.getWidth(this)*backgroundImage.getHeight(this));

        int x = (width - drawWidth) / 2 ;
        int y = (height - drawHeight) / 2;

        g.drawImage(backgroundImage,x,y,drawWidth,drawHeight,this);
    }

    @Override
    public void keyPressed(KeyEvent k){}

    @Override
    public void keyTyped(KeyEvent k){}

    @Override
    public void keyReleased(KeyEvent k){}

}
