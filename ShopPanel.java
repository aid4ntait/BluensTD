import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShopPanel extends JPanel
{
    private GridLayout griddy;
    private JButton cannonButton, dartMonkeyButton, sniperMonkeyButton, dartlingGunnerMonkeyButton, ninjaMonkeyButton, racoonMonkey; 
    private JLabel cost;
    
     public ShopPanel() 
    {
        this.setSize(180, 720);
        this.setBackground(Color.BLACK);

        // sets the layout of the shop to be a grid layout ofඞ one column and five rows 

        griddy = new GridLayout(5, 1, 0, 50);
        this.setLayout(griddy);

        this.addMouseListener(new Mouse());

        cannonButton = new JButton("Purchase Bomb Shooter");
        cannonButton.addActionListener(new cannonButtonListener());
        this.add(cannonButton);

        dartMonkeyButton = new JButton("Purchase Dart Monkey");
        dartMonkeyButton.addActionListener(new dartMonkeyButtonListener());
        this.add(dartMonkeyButton);

        sniperMonkeyButton = new JButton("Purchase Sniper Monkey");
        sniperMonkeyButton.addActionListener(new sniperMonkeyButtonListener());
        this.add(sniperMonkeyButton);

        ninjaMonkeyButton = new JButton("Purchase Ninja Monkey");
        ninjaMonkeyButton.addActionListener(new ninjaMonkeyButtonListener());
        this.add(ninjaMonkeyButton);

        dartlingGunnerMonkeyButton = new JButton("Purchase Dartling Gunner");
        dartlingGunnerMonkeyButton.addActionListener(new dartlingGunnerMonkeyButtonListener());
        this.add(dartlingGunnerMonkeyButton);


        
    }

    private void addButton(JPanel panel, String text, double value)
    {
        
    }
    private class Mouse extends MouseAdapter
    {
        public void mouseMoved(MouseEvent e)
        {
            if(e.getX() )
            {
                
            }
        }
    }
}
