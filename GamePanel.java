import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.ArrayList;

public class GamePanel extends JPanel
{
    //local objects 
    private ShopPanel market;
    private JButton button1; 
    private BorderLayout borderLayout = new BorderLayout();
    private JPanel monkeyZone; // invisible panel of same dimensions of the GamePanel 

    //Wave handling stuff
    private int currentWave = 0;
    private int bluenCount = 10;


    //Making all of the other classes exist so we can pass them through to each other
    private Bluens bluens;
    private Player player;
    private ScoreboardPanel scorePanel;

    ArrayList<Bluens> wave = new ArrayList<Bluens>();
    

    public GamePanel()
    { 
        player = new Player(); 
        bluens = new Bluens(player);
        market = new ShopPanel(player);

        this.setBackground(Color.GREEN.darker());
        this.setSize(1280,720);
        this.setLayout(borderLayout);

        monkeyZone = new JPanel(); 
        monkeyZone.setSize(1280,720);
        monkeyZone.setBackground(Color.BLACK);
        monkeyZone.setVisible(true);
        monkeyZone.setBackground(Color.GREEN.darker());

        market.setVisible(true);
        market.setBackground(Color.BLACK);
        this.add(market, borderLayout.EAST);
        this.add(monkeyZone, borderLayout.CENTER);
    }
    
    public static void addMonkey(int speed, int range, int damage, int x, int y)
    {
        Monkey moneky = new Monkey(speed, damage, range, x, y);
        // needs to add an icon of the monkey at the x y
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
            Player.balance += 100; //why uppercase Class Player instead of the local player we made? Aiden no know:/
            bluenCount += tempBluenCount - (5 * currentWave); //random algorithm to increase bluens over waves by increasing amount
        }
    }

    
    //mouse listener
    //gets x,y of mouse when click after buy
    //new monkey (1234145,123124,12414124,123,x,y)
}