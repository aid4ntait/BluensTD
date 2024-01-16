import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShopPanel extends JPanel
{
    private GridLayout griddy;
    private JLabel cost;
    private int xPosition; // used later for the mouse dragging
    private int yPosition;
    
    public ShopPanel(Player player) 
    {


        //manifests the shops actual picture 
        this.setBounds(0, 0, 180, 720);
        this.setBackground(Color.BLACK);

        // sets the layout of the shop to be a grid layout ofඞ one column and five rows 
        griddy = new GridLayout(5, 1, 0, 50);
        this.setLayout(griddy);

        // adds all the buttons for the monkeys 
        this.addButton("Ninja Monkey", 150);
        this.addButton("Dartling Gunner Monkey", 700);
        this.addButton("Sniper Monkey", 250);
        this.addButton("Dart Monkey", 100);
        this.addButton("Cannon", 300);
        
    }

    private void addButton(String name, Integer cost)
    {
        int price = cost; // so that when the button gets its tool tip text it reads the number instead of the Integer object location

        JButton button = new JButton();
        button.addMouseListener(new Mouse());
        button.setToolTipText("Drag to Purchase " + name + " for " + price + " Bananas.");

    }
    
    // mouse listener
    private class Mouse extends MouseAdapter
    {

        public Mouse()
        {
            xPosition = 0;
            yPosition = 0;
        }

        public void mouseDragged(MouseEvent e)
        {
            xPosition = e.getX();
            yPosition = e.getY();
        }

        public void mouseReleased(MouseEvent f)
        {
            xPosition = f.getX();
            yPosition = f.getY();
            GamePanel.monkeyBought();
        }

    }

    // makes sure that when the buttons are pressed they actually do something 
    /* private class buttonListener(Integer cost) implements addActionListener
    {
        private int price;

        public buttonListener()
        {
            price = cost;
        }

        public void actionPerformed(ActionEvent e)
        {
            GamePanel.monkeyBought();
        }
    }
    */
}
