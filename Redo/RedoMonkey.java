import java.awt.Graphics;

import javax.swing.*;

public class RedoMonkey {
    
    // Monkey stats
    public static int numOfMonkeys;
    //private double bluenDistance;
    private double attackSpeed;
    private int attackRange;
    private int attackDamage;
    private int xPosition;
    private int yPosition;

    public void draw(Graphics myBuffer) 
    {
        ImageIcon thomas = new ImageIcon("tj.jpg");
        myBuffer.drawImage(thomas.getImage(), xPosition, yPosition, 25, 25, null); 

    }   
}
