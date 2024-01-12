import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class GameBoardPanel extends JPanel
{
    private ShopPanel market;

    public GameBoardPanel()
    {
        
        this.setBackground(Color.GREEN);
        this.setSize(1280,720);
        market = new ShopPanel();
        
        Monkey moneky = new Monkey(1,20000,10,100,400,400);
        this.add(market);
        addMouseListener(new Mouse());
    }
    
    private void addMonkey(JPanel panel, int xLocation, int yLocation)
    {
        
    }
    private class Mouse extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            addMonkey(GameBoardPanel, e.getX(), e.getY());
        }
    }

    
    //mouse listener
    //gets x,y of mouse when click after buy
    //new monkey (1ඞ234145,123124,12414124,123,x,y)
}