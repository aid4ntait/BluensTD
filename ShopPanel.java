import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShopPanel extends JPanel
{
    private GridLayout griddy; 
    private ImageIcon dart, ninja, gattling, sniper, cannon;
    
    public ShopPanel(Player player) 
    {
        dart = new ImageIcon(getClass().getResource("/pngsBro/DartMonkey.png"));
        ninja = new ImageIcon(getClass().getResource("/pngsBro/NinjaMonkey.png"));
        gattling = new ImageIcon(getClass().getResource("/pngsBro/Gattling.png"));
        sniper = new ImageIcon(getClass().getResource("/pngsBro/Sniper.png"));
        cannon = new ImageIcon(getClass().getResource("/pngsBro/Cannon (2).png"));

        // sets the layout of the shop to be a grid layout of one column and five rows 
        griddy = new GridLayout(1, 5, 50, 50);
        this.setLayout(griddy);

        // adds all the buttons for the monkeys // they need their damage range and speed actually made 
        this.addButton("Ninja Monkey", 150, 1, 1, 1, ninja);
        this.addButton("Dartling Gunner Monkey", 700, 1 , 1, 1, gattling);
        this.addButton("Sniper Monkey", 250, 1, 1, 1, sniper);
        this.addButton("Dart Monkey", 100, 1, 1, 1, dart);
        this.addButton("Cannon", 300, 1, 1, 1, cannon);
        
    }

    // creates a button with the info relative to the monkey it is supposed to be able to add. Then, the button is given a mouse listener. 
    private void addButton(String name, int cost, int damage, int range, int speed, Icon icon)
    {

        JButton button = new JButton();
        button.addMouseListener(new Mouse(name, cost, speed, range, damage));
        button.setForeground(Color.BLACK);
        button.setIcon(icon);
        button.setToolTipText("Drag to Purchase " + name + " for " + cost + " Bananas.");
        add(button);
    }   

    // checks wether or not the player has enough money and then uses addMonkey in GamePanel
    public void monkeyBought(String name, int cost, int speed, int range, int damage, int x, int y)
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

        public void mouseReleased(MouseEvent f)
        {
            xPosition = f.getX();
            yPosition = f.getY();
            monkeyBought(name, cost, speed, range, damage, xPosition, yPosition);
            System.out.println("Price " + cost + "\nName " + name + "\nAt " + xPosition + ": " + yPosition);
        }
    }
}
