package engine;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import character.Player;
import java.awt.image.BufferedImage;

public class LevelOne extends JPanel implements ActionListener {
    private static final int FPS = 60;
    private static final long serialVersionUID = 1L;
    private int fpsCounter = 0;

    private Player player; 

    private GameEngine gameEngine;

    public LevelOne(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
        this.player = new Player(0, 0, this.gameEngine.getLoader().getPlayerSprite());
        setBackground(Color.ORANGE);
        setupGameLoop();
    }

    private void setupGameLoop() {
        javax.swing.Timer timer = new javax.swing.Timer(1000 / FPS, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        // Atualiza o estado do jogo
        update();

        // Renderiza o jogo
        repaint();
    }

    private void update() {
        // Coloque aqui a lógica de atualização do jogo
        fpsCounter+=1;
        if (fpsCounter > 11){
            fpsCounter = 0;
        } 
    }

    @Override
    protected void paintComponent(Graphics g) {
        int number = fpsCounter;

        BufferedImage currentSprite = player.getRunningSprites(number);

        super.paintComponent(g);
        g.drawImage(
            currentSprite,
            10,
            10,
            currentSprite.getWidth()*8, 
            currentSprite.getHeight()*8,
            null
        );
    }
}
