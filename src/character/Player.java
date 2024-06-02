package character;

import java.awt.image.BufferedImage;

public class Player extends Character {
    //Atirando parado
    //Correndo Atirando
    //Pulando Atirando
    //Escalando 
    //Escalando Atirando
    //Missão Concluida
    //Morrendo
    //Tomando dano
    private BufferedImage[] introductionSprites;
    private BufferedImage[] idleSprites;
    private BufferedImage[] shootingSprites;
    private BufferedImage[] runningSprites;
    private BufferedImage[] jumpSprites;
    private BufferedImage[] celebrationSprite;
    private BufferedImage[] dyingSprites;
    private BufferedImage[] takingDamageSprites;
    



    public Player(int positionX, int positionY, BufferedImage sprite){
        super(positionX, positionY,100, sprite);
        formatSprites(super.getSpriteSheet());
    }


    private void formatSprites(BufferedImage sprite){
        this.introductionSprites = formatIntroductionSprites();
        this.idleSprites = formatIdleSprites();
        this.runningSprites = formatRunningSprites();
        this.jumpSprites = formatJumpSprites();
        this.celebrationSprite = formatCelebrationSprite();
        this.dyingSprites = formatDyingSprites();
        this.takingDamageSprites = formatTakingDamageSprites();
        this.shootingSprites = formatShootingSprites();
    }

    private BufferedImage[] formatIntroductionSprites(){
        BufferedImage[] introductionSprites = new BufferedImage[7];
        
        introductionSprites[0] = super.getSpriteSheet().getSubimage(4, 14, 8, 48);
        introductionSprites[1] = super.getSpriteSheet().getSubimage(18, 33, 22, 29);
        introductionSprites[2] = super.getSpriteSheet().getSubimage(45, 20, 30, 42);
        introductionSprites[3] = super.getSpriteSheet().getSubimage(83, 23, 30, 39);
        introductionSprites[4] = super.getSpriteSheet().getSubimage(119, 26, 30, 36);
        introductionSprites[5] = super.getSpriteSheet().getSubimage(155, 28, 30, 34);
        introductionSprites[6] = super.getSpriteSheet().getSubimage(190, 30, 30, 32);

        return introductionSprites;
    }

    private BufferedImage[] formatIdleSprites(){
        BufferedImage[] idleSprites = new BufferedImage[4];

        idleSprites[0] = super.getSpriteSheet().getSubimage(225,28,30,34);
        idleSprites[1] = super.getSpriteSheet().getSubimage(260,28,30,34);
        idleSprites[2] = super.getSpriteSheet().getSubimage(294,28,30,34);
        idleSprites[3] = super.getSpriteSheet().getSubimage(329,28,30,34);

        return idleSprites;
    }

    private BufferedImage[] formatShootingSprites(){
        BufferedImage[] shootingSprites = new BufferedImage[2];

        shootingSprites[0] = super.getSpriteSheet().getSubimage(364,28,30,34);
        shootingSprites[1] = super.getSpriteSheet().getSubimage(401,28,29,34);

        return shootingSprites;
    }

    private BufferedImage[] formatRunningSprites(){
        BufferedImage[] tmp = new BufferedImage[0];
        return tmp;
    }
    private BufferedImage[] formatJumpSprites(){
        BufferedImage[] tmp = new BufferedImage[0];
        return tmp;
    }
    private BufferedImage[] formatCelebrationSprite(){
        BufferedImage[] tmp = new BufferedImage[0];
        return tmp;
    }
    private BufferedImage[] formatDyingSprites(){
        BufferedImage[] tmp = new BufferedImage[0];
        return tmp;
    }
    private BufferedImage[] formatTakingDamageSprites(){
        BufferedImage[] tmp = new BufferedImage[0];
        return tmp;
    }

    public BufferedImage getIntroductionSprites(int frame){
        return this.introductionSprites[frame];
    }

    public BufferedImage getIdleSprites(int frame){
        return this.idleSprites[frame];
    }

    public BufferedImage getShootingSprites(int frame){
        return this.shootingSprites[frame];
    }
}
