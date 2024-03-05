
import java.awt.Graphics;

import javax.swing.*;

public class Monkey {
    
    // Monkey stats
    private static int numOfMonkeys;
    //private double bluenDistance;
    private double attackSpeed;
    private int attackRange;
    private int attackDamage;
    private int xPosition;
    private int yPosition;
    private ImageIcon monkeyIcon;
    private String type;
    public Monkey(String type, int x, int y, ImageIcon icon)
    {
        this.xPosition =x;
        this.yPosition = y;
        monkeyIcon = icon;
        this.type = type;
        //based on type set atk speed, dmg, range
        numOfMonkeys++;
        switch(type)
        {
            case("dart"):
            {

                attackSpeed = 50;
                attackDamage = 100;
                attackRange = 50;
            }
            case("sniper"):
            {
                attackSpeed = 10;
                attackDamage = 500;
                attackRange = 150;
            }
            
        }
    }
    public void draw(Graphics myBuffer) 
    {
        System.out.println("Trying to draw monkey at " + xPosition + ": " + yPosition);
        myBuffer.drawImage(this.monkeyIcon.getImage(), xPosition, yPosition, 25, 25, null); 

    }   
    public int getNumOfMonkeys()
    {
        return numOfMonkeys;
    }
    public String toString()
    {
        return type + " at " + xPosition + " : " + yPosition;
    }
}
