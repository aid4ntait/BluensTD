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
        this.addButton("Ninja Monkey", 150, ninja);
        this.addButton("Dartling Gunner Monkey", 700, gattling);
        this.addButton("Sniper Monkey", 250, sniper);
        this.addButton("Dart Monkey", 100, dart);
        this.addButton("Cannon", 300, cannon);
        
    }

    // creates a button with the info relative to the monkey it is supposed to be able to add. Then, the button is given a mouse listener. 
    private void addButton(String name, int cost, Icon icon)
    {

        JButton button = new JButton();
        button.addMouseListener(new Mouse(name, cost));
        button.setForeground(Color.BLACK);
        button.setIcon(icon);
        button.setToolTipText("Drag to Purchase " + name + " for " + cost + " Bananas.");
        add(button);
    }   

    // checks wether or not the player has enough money and then uses addMonkey in GamePanel
    public void monkeyBought(String name, int cost)
    {
        if(Player.balance >= cost)
        {
            System.out.println("in Shop; MonkeyBought");
            Player.balance -= cost; 
            GamePanel.placeMoneky(name);
        }
    }
    
    // mouse listener that deals with the actions of the button, also stores all of the buttons info so that it can pass it through to monkeyBought;
    private class Mouse extends MouseAdapter
    {
        private int cost;
        private String name;

        public Mouse(String name, int cost)
        {
            
            this.cost = cost;
            this.name = name;
        }

        public void mouseClicked(MouseEvent f)
        {
            System.out.println("In Shop: MouseClicked");
            monkeyBought(name, cost);
            
        }
    }
}
