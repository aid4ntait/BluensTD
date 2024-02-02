import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


// this is a temp file that I made so that I could test how we could use other layouts to try to fix our little shop panel issue -Andrew 
public class AndrewsTestFile extends JPanel
{

    // temp variabels 
    GridBagLayout griddy;
    GridBagConstraints gbc;

    //local objects 
    private ShopPanel shop;
    private JPanel monkeyZone; // invisible panel of same dimensions of the GamePanel 

    //Wave handling stuff
    private int currentWave = 0;
    private int bluenCount = 10;


    //Making all of the other classes exist so we can pass them through to each other
    private Bluens bluens;
    private Player player;
    private ScoreboardPanel scorePanel;

    ArrayList<Bluens> wave = new ArrayList<Bluens>();
    

    public AndrewsTestFile()
    { 
        player = new Player(); 
        bluens = new Bluens(player);
        griddy = new GridBagLayout();
        gbc = new GridBagConstraints();

        this.setLayout(griddy);
        this.setBackground(Color.GREEN.darker());

        monkeyZone = new JPanel(); 
        gbc.gridheight = 1;
        gbc.gridwidth = 2; 
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(monkeyZone, gbc);
        monkeyZone.setBackground(Color.RED);

        shop = new ShopPanel(player);
        shop.setVisible(true);
        shop.setBackground(Color.BLACK);
        this.add(shop);
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
            bluenCount += tempBluenCount - (5 * currentWave);
        }
    }
}

