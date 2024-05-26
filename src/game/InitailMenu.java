package game;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class InitailMenu extends JPanel {
    
    public InitailMenu(GameEngine gameEngine){

        //===Align vertically at the top and center horizontally
        // JLabel backgroundLabel = new JLabel(assetLoader.getMenuBackgroundImage());
        // backgroundLabel.setHorizontalAlignment(JLabel.CENTER); 
        // backgroundLabel.setVerticalAlignment(JLabel.TOP); 
        // window.setContentPane(backgroundLabel);
        
        //===Centers on screen
        // JLabel backgroundLabel = new JLabel(assetLoader.getMenuBackgroundImage());
        // backgroundLabel.setBounds(0, 0, WIDTH, HEIGHT);
        // window.setContentPane(backgroundLabel);

        JLabel backgroundLabel = new JLabel(gameEngine.getLoader().getMenuBackgroundImage());
        backgroundLabel.setBounds(0, 0, gameEngine.getWidth(), gameEngine.getWidth());
        gameEngine.getWindow().setContentPane(backgroundLabel);


        JLabel startGameLabel = createLabel(
            "Começar",
            gameEngine.getWidth(),
            gameEngine.getHeight(),
            backgroundLabel.getIcon().getIconHeight()
        );
        gameEngine.getWindow().add(startGameLabel);

        JLabel endGameLabel = createLabel(
            "Sair",
            gameEngine.getWidth(),
            gameEngine.getHeight(),
            backgroundLabel.getIcon().getIconHeight()
        );
        gameEngine.getWindow().add(endGameLabel);

        JLabel selectMenuItem = new JLabel();
        selectMenuItem.setIcon(gameEngine.getLoader().getSelectMenuItem());
        selectMenuItem.setBounds((
            gameEngine.getWidth() - selectMenuItem.getPreferredSize().width) / 2 - 200, (gameEngine.getHeight() + backgroundLabel.getIcon().getIconHeight()) / 2 -35, selectMenuItem.getPreferredSize().width, selectMenuItem.getPreferredSize().height
        );

        gameEngine.getWindow().add(selectMenuItem);
        
    }

    private JLabel createLabel(String text, int width , int height, int backgroundLabel){
        int marginBottom = text == "Sair" ? 40 : 0;
        
        JLabel label = new JLabel(text);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 26));
        int labelEndWidth = label.getPreferredSize().width;
        int labelEndHeight = label.getPreferredSize().height;
        label.setBounds((width - labelEndWidth) / 2, (height + backgroundLabel) / 2 + marginBottom, labelEndWidth, labelEndHeight);
        return label;
    }

}
