import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel
{
    //local objects 
    private ShopPanel shop;
    private JButton button1; 
    private BorderLayout borderLayout;
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
        shop = new ShopPanel(player);
        borderLayout = new BorderLayout();
        monkeyZone = new JPanel(); 

        this.setLayout(borderLayout);

        monkeyZone.setBackground(Color.GREEN.darker());

        shop.setBackground(Color.BLACK);
        this.add(shop, BorderLayout.SOUTH);
        this.add(monkeyZone, BorderLayout.CENTER);
    }
    
    public static void addMonkey(int speed, int range, int damage, int x, int y)
    {
        Monkey moneky = new Monkey(speed, damage, range, x, y);
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