import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShopPanel extends JPanel
{
    private GridLayout griddy;
    private JButton purchaseButton; 
    
     public ShopPanel()
    {
        this.setSize(180, 720);
        this.setBackground(Color.BLACK);

        // sets the layout of the shop to be a grid layout of one column and five rows 

        griddy = new GridLayout(5,1,0,50);
        this.setLayout(griddy);
    }
}