package character;

import java.awt.image.BufferedImage;

public abstract class Character {

    private int positionOnTheXAxis;
    private int positionOnTheYAxis;
    private int healthPoints; 
    private BufferedImage spriteSheet; 

    public Character(int positionX, int positionY,int healthPoints, BufferedImage sprite){
        this.positionOnTheXAxis = positionX;
        this.positionOnTheYAxis = positionY;
        this.healthPoints = healthPoints;
        this.spriteSheet = sprite;
    }

    public BufferedImage getSpriteSheet(){
        return this.spriteSheet;
    }

    public int getPositionOnTheXAxis(){
        return this.positionOnTheXAxis;
    }

    public void setPositionOnTheXAxis(int newPositionX){
        this.positionOnTheXAxis = newPositionX;
        return;
    }

    public int getPositionOnTheYAxis(){
        return this.positionOnTheYAxis;
    }

    public void setPositionOnTheYAxis(int newPositionY){
        this.positionOnTheYAxis = newPositionY;
        return;
    }

    public void setPosition(int positionX, int positionY){
        this.positionOnTheXAxis = positionX;
        this.positionOnTheYAxis = positionY;
        return;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }
    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
        return; 
    }
}
