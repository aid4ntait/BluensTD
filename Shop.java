import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Shop extends JPanel
{
    private GridLayout griddy;
    private JButton button; 

    // for whatever reason vs is running this as a method and not a constructor which is pretty swag
    
     public void Shop()
    {
        this.setSize(180, 720);
        this.setBackground(Color.BLACK);

        // sets the layout of the shop to be a grid layout of one column and five rows 

        griddy = new GridLayout(5,1,0,50);
        this.setLayout(griddy);
    }
}
