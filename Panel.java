import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Panel extends JPanel
{
    public boolean monkeyBought;
  // No more shop panel  private ShopPanel market;
    private JButton button1; 
    private JLabel cost; //?
    private JPanel gamingPanel;
    private ShopPanel market;

    public Panel()
    {
        this.setBackground(Color.GREEN);
        this.setSize(1280,720);
        gamingPanel = new JPanel(); //we gaming boys // we are so cracked
        gamingPanel.setBackground(Color.GREEN);
        gamingPanel.setSize(1280,720);
        market = new ShopPanel();
        this.add(market);
        
   //     market = new ShopPanel();
        
        Monkey moneky = new Monkey(1,20000,10,100,400,400); //moneky :)
      //  this.add(market);
        addMouseListener(new Mouse());
    }
    
    private void addMonkey(JPanel panel, int xLocation, int yLocation)
    {
        Monkey monkey = new Monkey(1,20000,10,100,400,400);
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

    
    //mouse listener
    //gets x,y of mouse when click after buy
    //new monkey (1ඞ234145,123124,12414124,123,x,y)
}