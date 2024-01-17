import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShopPanel extends JPanel
{
    private GridLayout griddy; 
    
    public ShopPanel(Player player) 
    {

        //manifests the shops actual picture 
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(1280, 175));

        // sets the layout of the shop to be a grid layout of one column and five rows 
        griddy = new GridLayout(1, 5, 20, 10);
        this.setLayout(griddy);

        // adds all the buttons for the monkeys // they need their damage range and speed actually made 
        this.addButton("Ninja Monkey", 150, 1, 1, 1);
        this.addButton("Dartling Gunner Monkey", 700, 1 , 1, 1);
        this.addButton("Sniper Monkey", 250, 1, 1, 1);
        this.addButton("Dart Monkey", 100, 1, 1, 1);
        this.addButton("Cannon", 300, 1, 1, 1);
        
    }

    // creates a button with the info relative to the monkey it is supposed to be able to add. Then, the button is given a mouse listener. 
    private void addButton(String name, int cost, int damage, int range, int speed)
    {

        JButton button = new JButton();
        button.addMouseListener(new Mouse(name, cost, speed, range, damage));
        button.setIcon(new ImageIcon("dartMonekySized.png"));
        button.setToolTipText("Drag to Purchase " + name + " for " + cost + " Bananas.");
        add(button);
    }

    // checks wether or not the player has enough money and then uses addMonkey in GamePanel
    public static void monkeyBought(String name, int cost, int speed, int range, int damage, int x, int y)
    {
        if(Player.balance >= cost)
        {
            Player.balance -= cost; 
            GamePanel.addMonkey(speed, range, damage, x, y);
        }
    }
    
    // mouse listener that deals with the actions of the button, also stores all of the buttons info so that it can pass it through to monkeyBought;
    private class Mouse extends MouseAdapter
    {
        private int cost;
        private int speed;
        private int range;
        private int damage;
        private String name;
        private int xPosition;
        private int yPosition;

        public Mouse(String name, int price, int speed, int range, int damage)
        {
            xPosition = 0;
            yPosition = 0;
            cost = price;
            this.speed = speed;
            this.damage = damage;
            this.range = range;
            this.name = name;
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
            monkeyBought(name, cost, speed, range, damage, xPosition, yPosition);
        }
    }
}
