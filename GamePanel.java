import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class GamePanel extends JPanel
{
    private boolean monkeyBought;
  // No more shop panel  private ShopPanel market;
    private JButton button1; 
    private JPanel gamingPanel;
    private ShopPanel market;

    public GamePanel()
    {
        this.setBackground(Color.GREEN);
        this.setSize(1280,720);

        gamingPanel = new JPanel(); //we gaming boys // we are so cracked
        gamingPanel.setBackground(Color.GREEN);
        gamingPanel.setSize(1280,720);

        market = new ShopPanel();
        this.add(market);
        
         //moneky :)
        addMouseListener(new Mouse());
    }
    
    private void addMonkey(JPanel panel, int xLocation, int yLocation)
    {
        Monkey moneky = new Monkey(1,20000,50,100,xLocation,yLocation);
    }
    private class Mouse extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            if(monkeyBought)
            {
                addMonkey(gamingPanel, e.getX(), e.getY());
                monkeyBought = !monkeyBought;
            }
        }
    }
    public static void monkeyBought()
    {
        monkeyBought = true;
    }

    
    //mouse listener
    //gets x,y of mouse when click after buy
    //new monkey (1ඞ234145,123124,12414124,123,x,y)
}