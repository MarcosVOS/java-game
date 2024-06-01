package engine;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Image;

public class HomeMenu extends JPanel implements KeyListener {
    private final int START_Y = 520; 
    private final int EXIT_Y = 560; 

    private GameEngine gameEngine;
    private int itemSelectedOnTheYAxis = START_Y;
    private JLabel startGame;
    private JLabel endGame;

    public HomeMenu(GameEngine gameEngine){
        this.gameEngine = gameEngine;
        initializeMenu();
    }

    public void initializeMenu(){
        setLayout(null);
        setBackground(Color.BLACK);

        startGame = createLabel(
            "Começar",
            gameEngine.getWidth(),
            gameEngine.getHeight()+400
        );
        add(startGame);

        endGame = createLabel(
            "Sair",
            gameEngine.getWidth(),
            gameEngine.getHeight()+400
        );
        add(endGame);

        gameEngine.getWindow().addKeyListener(this);
        setFocusTraversalKeysEnabled(false);

        gameEngine.getLoader().playSound(gameEngine.getLoader().getMenuSound());
        updateLabelColor();
    }

    private JLabel createLabel(String text, int width , int height){
        Color labelColor = new Color(82,231,255);

        int marginBottom = text.equals("Sair") ? 40 : 0;
        
        JLabel label = new JLabel(text);
        label.setForeground(labelColor);
        label.setFont(gameEngine.getLoader().getFont());
        int labelEndWidth = label.getPreferredSize().width;
        int labelEndHeight = label.getPreferredSize().height;
        label.setBounds((width - labelEndWidth) / 2, (height / 2) + marginBottom, labelEndWidth, labelEndHeight);
        return label;
    }

    public void updateLabelColor() {
        Color defaultColor = new Color(82, 231, 255);
        Color selectedColor = new Color(247, 140, 0);

        startGame.setForeground(itemSelectedOnTheYAxis == START_Y ? selectedColor : defaultColor);
        endGame.setForeground(itemSelectedOnTheYAxis == EXIT_Y ? selectedColor : defaultColor);
        return;
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
        g.drawImage(
            gameEngine.getLoader().getSelectMenuItem().getImage(),
            480,
            itemSelectedOnTheYAxis,
            null
        );
    }

    @Override
    public void keyPressed(KeyEvent k){
        int pressedKey = k.getKeyCode();
        switch(pressedKey){
            case KeyEvent.VK_UP:
                itemSelectedOnTheYAxis = START_Y;
                break;
            case KeyEvent.VK_DOWN:
                itemSelectedOnTheYAxis = EXIT_Y;
                break;
            case KeyEvent.VK_ENTER:
                handleEnterKey();
                break;
            default:
                break;
        }
        updateLabelColor();
        repaint();
    }

    private void handleEnterKey(){
        gameEngine.getLoader().stopSound();
        gameEngine.getLoader().playSound(gameEngine.getLoader().getSelectMenuItemSound());
        if (itemSelectedOnTheYAxis == EXIT_Y) {
            gameEngine.getWindow().dispose();
        }else if(itemSelectedOnTheYAxis == START_Y){
            gameEngine.setStage(GameEngine.CurrentStage.LEVEL_ONE);
        }   
    }

    @Override
    public void keyTyped(KeyEvent k){}

    @Override
    public void keyReleased(KeyEvent k){}

}
