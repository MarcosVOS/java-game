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
        BufferedImage[] runningSprites = new BufferedImage[11];
        runningSprites[0] = super.getSpriteSheet().getSubimage(4,66,30,34);
        runningSprites[1] = super.getSpriteSheet().getSubimage(49,66,20,34);
        runningSprites[2] = super.getSpriteSheet().getSubimage(74,66,23,35);
        runningSprites[3] = super.getSpriteSheet().getSubimage(104,67,32,34);
        runningSprites[4] = super.getSpriteSheet().getSubimage(144,67,34,33);
        runningSprites[5] = super.getSpriteSheet().getSubimage(189,67,26,33);
        runningSprites[6] = super.getSpriteSheet().getSubimage(221,66,22,34);
        runningSprites[7] = super.getSpriteSheet().getSubimage(247,66,25,35);
        runningSprites[8] = super.getSpriteSheet().getSubimage(279,66,30,34);
        runningSprites[9] = super.getSpriteSheet().getSubimage(317,67,34,33);
        runningSprites[10] = super.getSpriteSheet().getSubimage(358,67,29,33);

        return runningSprites;
    }
    private BufferedImage[] formatJumpSprites(){
        BufferedImage[] jumpSprites = new BufferedImage[7];

        jumpSprites[0] = super.getSpriteSheet().getSubimage(5, 147, 24, 37);
        jumpSprites[1] = super.getSpriteSheet().getSubimage(36, 147, 15, 41);
        jumpSprites[2] = super.getSpriteSheet().getSubimage(55, 145, 19, 46);
        jumpSprites[3] = super.getSpriteSheet().getSubimage(79, 149, 23, 41);
        jumpSprites[4] = super.getSpriteSheet().getSubimage(107, 149, 27, 42);
        jumpSprites[5] = super.getSpriteSheet().getSubimage(138, 150, 24, 38);
        jumpSprites[6] = super.getSpriteSheet().getSubimage(165, 152, 30, 32);

        return jumpSprites;
    }
    private BufferedImage[] formatCelebrationSprite(){
        BufferedImage[] celebrationSprite = new BufferedImage[5];

        celebrationSprite[0] = super.getSpriteSheet().getSubimage(220, 255, 28, 45);
        celebrationSprite[1] = super.getSpriteSheet().getSubimage(258, 255, 29, 45);
        celebrationSprite[2] = super.getSpriteSheet().getSubimage(296, 252, 34, 48);
        celebrationSprite[3] = super.getSpriteSheet().getSubimage(334, 255, 29, 45);
        celebrationSprite[4] = super.getSpriteSheet().getSubimage(372, 255, 31, 45);

        return celebrationSprite;
    }
    private BufferedImage[] formatDyingSprites(){
        BufferedImage[] dyingSprites = new BufferedImage[7];

        dyingSprites[0] = super.getSpriteSheet().getSubimage(326, 329, 26, 36);
        dyingSprites[1] = super.getSpriteSheet().getSubimage(356, 329, 26, 36);
        dyingSprites[2] = super.getSpriteSheet().getSubimage(395, 343, 6, 6);
        dyingSprites[3] = super.getSpriteSheet().getSubimage(405, 342, 8, 8);
        dyingSprites[4] = super.getSpriteSheet().getSubimage(416, 341, 9, 9);
        dyingSprites[5] = super.getSpriteSheet().getSubimage(428, 340, 11, 11);
        dyingSprites[6] = super.getSpriteSheet().getSubimage(442, 338, 15, 15);

        return dyingSprites;       
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

    public BufferedImage getRunningSprites(int frame){
        return this.runningSprites[frame];
    }

    public BufferedImage getJumpSprites(int frame){
        return this.jumpSprites[frame];
    }
    
    public BufferedImage getCelebrationSprite(int frame){
        return this.celebrationSprite[frame];
    }

    public BufferedImage getDyingSprites(int frame){
        return this.dyingSprites[frame];
    }
}
