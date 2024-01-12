import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShopPanel extends JPanel
{
    private GridLayout griddy;
    private JButton cannonButton, dartMonkeyButton, sniperMonkeyButton, dartlingGunnerMonkeyButton, ninjaMonkeyButton, racoonMonkey; 
    private JLabel cost;
    private Player player;
    public ShopPanel() 
    {
        this.setSize(180, 720);
        this.setBackground(Color.BLACK);

        // sets the layout of the shop to be a grid layout ofඞ one column and five rows 

        griddy = new GridLayout(5, 1, 0, 50);
        this.setLayout(griddy);

        this.addMouseListener(new Mouse());

        
        dartMonkeyButton = new JButton("Purchase Dart Monkey");
        dartMonkeyButton.addActionListener(new dartMonkeyButtonListener());
        this.add(dartMonkeyButton);
        /*
        cannonButton = new JButton("Purchase Bomb Shooter");
        cannonButton.addActionListener(new cannonButtonListener());
        this.add(cannonButton);


        sniperMonkeyButton = new JButton("Purchase Sniper Monkey");
        sniperMonkeyButton.addActionListener(new sniperMonkeyButtonListener());
        this.add(sniperMonkeyButton);

        ninjaMonkeyButton = new JButton("Purchase Ninja Monkey");
        ninjaMonkeyButton.addActionListener(new ninjaMonkeyButtonListener());
        this.add(ninjaMonkeyButton);

        dartlingGunnerMonkeyButton = new JButton("Purchase Dartling Gunner");
        dartlingGunnerMonkeyButton.addActionListener(new dartlingGunnerMonkeyButtonListener());
        this.add(dartlingGunnerMonkeyButton);
        */


        
    }
    private class dartMonkeyButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(Player.)
        }
    }
    /* 
    private class Mouse extends MouseAdapter
    {
        public void mouseMoved(MouseEvent e)
        {
            if(e.getX() )
            {
                
            }
        }
    }
    */
}
