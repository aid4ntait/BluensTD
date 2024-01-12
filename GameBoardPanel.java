import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameBoardPanel extends JPanel
{
    private ShopPanel market;

    public GameBoardPanel()
    {
        this.setBackground(Color.GREEN);
        this.setSize(1280,720);
        market = new ShopPanel();

        this.add(market);
    }
    //mouse listener
    //gets x,y of mouse when click after buy
    //new monkey (1234145,123124,12414124,123,x,y)
}