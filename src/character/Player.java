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
    private BufferedImage[] runningSprites;
    private BufferedImage[] jumpSprites;
    private BufferedImage[] celebrationSprite;
    private BufferedImage[] dyingSprites;
    private BufferedImage[] takingDamageSprites;
    private BufferedImage[] shootingSprites;



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
        BufferedImage[] tmp = new BufferedImage[0];
        return tmp;
    }
    private BufferedImage[] formatIdleSprites(){
        BufferedImage[] tmp = new BufferedImage[0];
        return tmp;
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
    private BufferedImage[] formatShootingSprites(){
        BufferedImage[] tmp = new BufferedImage[0];
        return tmp;
    }

}
