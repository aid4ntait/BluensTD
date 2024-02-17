import javax.swing.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.image.*;

public class GamePanel extends JPanel
{
    //local objects 
    private ShopPanel shop;
    private JButton button1; 
    private BorderLayout borderLayout;
    private JPanel monkeyZone; // invisible panel of same dimensions of the GamePanel 
    private BufferedImage myImage;
    private Graphics myBuffer;
    private Timer time;
    
    //Wave handling stuff
    private int currentWave = 0;
    private int bluenCount = 10;

    static boolean placeMoneky = false;
    public static String currentType = "Ninja Monkey";
    private ImageIcon dart, ninja, gattling, sniper, cannon;
    
    //Making all of the other classes exist so we can pass them through to each other
    private Bluens bluens;
    private Player player;
    //private ScoreboardPanel scorePanel;

    ArrayList<Bluens> wave = new ArrayList<Bluens>();
    
    private int currentMouseX;
    private int currentMouseY;
    private int i;

    public GamePanel()
    { 
        player = new Player(); 
        bluens = new Bluens(player);
        shop = new ShopPanel(player);
        borderLayout = new BorderLayout();
        monkeyZone = new JPanel();

        this.setLayout(borderLayout);

        monkeyZone.setBackground(Color.GREEN.darker());
        ImageIcon image = new ImageIcon("DartMonkey.png");
        JLabel icon = new JLabel(); // add switch case for icon
        icon.setIcon(image);
        icon.setLocation(100, 100);
        monkeyZone.add(icon);
        shop.setBackground(Color.BLACK);
        this.add(shop, BorderLayout.SOUTH);
        this.add(monkeyZone, BorderLayout.CENTER);
        time = new Timer(24, new PrizeListener()); // need to do graphics and guis
        time.start();
        addMouseListener(new MouseAdapter() 
        {
            public void mousePressed(MouseEvent e) 
            {
                //update current mouse coordinates
                currentMouseX = e.getX();
                currentMouseY = e.getY();
                
                //create new Moneky r
                if (placeMoneky == true) 
                {
                    ImageIcon image = new ImageIcon("DartMonkey.png");
                    JLabel icon = new JLabel(); // add switch case for icon
                    icon.setIcon(image);
                    System.out.println("X:Y " +currentMouseX + " : " + currentMouseY);
                    icon.setLocation(currentMouseX, currentMouseY);
                    monkeyZone.add(icon);
                    addMonkey(currentType, currentMouseX, currentMouseY);
                    
                    
                }
            }

                
        });
        
    }
    
    
    private class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)  
        {
            
            repaint();
        }
    }
    
    public void paintComponent(Graphics g)
    {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);


    }
    
    public static void addMonkey(String type, int x, int y)
    {
        Monkey moneky = new Monkey(type, x,y);
    }
    
    private class Mouse extends MouseAdapter
    {
        public void mouseDragged(MouseEvent e) 
        {

        }
    }
    
    public static void placeMoneky()
    {
        placeMoneky = true;
        //currentType = type;
        
    }

    private static void waveHandler(int currentWave, int bluenCount)
    {
        //Stuff to trigger the next wave
        int previousWaveCounter = 0;
        int tempBluenCount = bluenCount; //makes it so we can easily increment, while also judging wave progress by bluens killed
        if(bluenCount == 0)
        {
            previousWaveCounter = currentWave;
            currentWave += 1;
        }

        if(currentWave > previousWaveCounter)
        {
            Player.balance += 100; 
            bluenCount += tempBluenCount - (5 * currentWave); //random algorithm to increase bluens over waves by increasing amount
        }
    }
}