import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class GamePanel extends JPanel
{
    //local objects 
    private ShopPanel market;
    private JButton button1; 
    private JPanel monkeyZone; // invisible panel of same dimensions of the GamePanel 

    //Wave handling stuff
    private int currentWave = 0;
    private int bluenCount = 10;


    //Making all of the other classes exist so we can pass them through to each other
    private Bluens bluens;
    private Player player;
    private ScoreboardPanel scorePanel;


    public GamePanel()
    { 
        player = new Player(); 
        bluens = new Bluens(player);
        market = new ShopPanel(player);

        this.setBackground(Color.GREEN);
        this.setSize(1280,720);

        monkeyZone = new JPanel(); 
        monkeyZone.setSize(1280,720);
        monkeyZone.setVisible(false);

        this.add(market);
    }
    
    // the shop is the only class that will call this method. This acts as a way for the shop to tell the player that it must subtract money. 
    public static void monkeyBought() 
    {
        
    }
    
    private void addMonkey(int xLocation, int yLocation)
    {
        Monkey moneky = new Monkey(1,20000,100,xLocation,yLocation); //moneky :)
        //yall I can't see these values can we make primitives for them?
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
    //new monkey (1ඞ234145,123124,12414124,123,x,y)
}